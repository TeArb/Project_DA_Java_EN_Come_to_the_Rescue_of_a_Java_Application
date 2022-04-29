/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.ISortedSymptoms;
import com.hemebiotech.analytics.interfaces.IWriteSymptoms;

public class AnalyticsMain {
	/**
	 * 
	 * @param main class of the application which will contain the instance functions of other classes
	 */ 
	public static void main(String[] args) throws IOException {
		
		ReadSymptomDataFromFile readSympotms = new ReadSymptomDataFromFile("symptoms.txt");
		// Get the list of symptoms.
		List<String> symptoms = readSympotms.getSymptoms();		
		
		ISortedSymptoms sortTheSymptoms = new SortSymptom();
		// Count and sort the symptoms.
		TreeMap<String, Integer> sortedSymptoms = sortTheSymptoms.sortSymptoms(symptoms);	
		
		IWriteSymptoms writeTheSymptoms = new WriteSymptomsDataToResultFile();	
		// Write the symptoms in a new file.
		writeTheSymptoms.writeResult(sortedSymptoms);
		
	}

}
