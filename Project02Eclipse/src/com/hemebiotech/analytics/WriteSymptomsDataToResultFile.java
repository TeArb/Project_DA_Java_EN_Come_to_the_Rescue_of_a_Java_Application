/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.IWriteSymptoms;

public class WriteSymptomsDataToResultFile implements IWriteSymptoms {
	/**
	* 
	* @param open and write the symptoms in another file
	*/
	@Override
	public void writeResult(TreeMap<String, Integer> processedElements) {
		try {
		FileWriter createResult = new FileWriter ("result.out");
		// Iterating through the entries of the TreeMap.
		Iterator<Map.Entry<String, Integer>> iteratorElements = processedElements.entrySet().iterator();
		
		// Write to the file while there is an element.
	    while (iteratorElements.hasNext()) {
	        Map.Entry<String, Integer> entry = iteratorElements.next();
	        createResult.append(entry.getKey() + "=" + entry.getValue() + "\n");
 	    }
		
		createResult.close();
		System.out.println("Successfully wrote to the file.");
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("An error occurred.");
		}
		
	}	
}
