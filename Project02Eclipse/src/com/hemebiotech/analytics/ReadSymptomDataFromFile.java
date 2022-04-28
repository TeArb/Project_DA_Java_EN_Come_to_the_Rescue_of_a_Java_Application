/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.interfaces.ISymptomReader;

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private static ArrayList<String> displaySymptoms = new ArrayList<String>();
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	/**
	 * 
	 * @param display the symptoms
	 */
	@Override
	public List<String> getSymptoms() {
		
		BufferedReader readSymptomFile;
		String lineSymptoms;
		
		if (filepath != null) {
			try {
				readSymptomFile = new BufferedReader (new FileReader(filepath));
				
				// Reading all the lines of input text file.
				while ((lineSymptoms = readSymptomFile.readLine()) != null) {
					displaySymptoms.add(lineSymptoms);	
				}	
								
				// Release of allocated resources.
				readSymptomFile.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return displaySymptoms;
	} 

}	