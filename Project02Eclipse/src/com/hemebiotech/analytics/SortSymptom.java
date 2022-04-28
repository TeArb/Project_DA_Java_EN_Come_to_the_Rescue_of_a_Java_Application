/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.ISortedSymptoms;

public class SortSymptom implements ISortedSymptoms {
	/**
	 * 
	 * @param sort map by Key in alphabetical order
	 */
	@Override
	public TreeMap<String, Integer> sortSymptoms(List<String> listSymptom) {
        // TreeMap to store values of HashMap and copy all data from hashMap into TreeMap.
        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
        
        HashMap<String, Integer> symptomNumbers = countIterationSymptoms(listSymptom);
        // Sort the number of symptoms
        sortedSymptoms.putAll(symptomNumbers);
        
		return sortedSymptoms;
    }
	/**
	 * 
	 * @param count the number of iteration symptoms
	 */
	private HashMap<String, Integer> countIterationSymptoms(List<String> symptoms) {
		 
		 HashMap<String, Integer> elementSymptomsFile = new HashMap<String, Integer>();
		 
		 for(String symptom : symptoms) {
				// Asking whether the HashMap contains the key or not.
				Integer numberOfSymptoms = elementSymptomsFile.get(symptom);
					
				if (numberOfSymptoms == null) {
		        	// Storing the word as key and its occurrence as value in the HashMap.
		            elementSymptomsFile.put(symptom, 1);
		 
		        } else {
		        	// Incrementing the value if the word is already present.
		        	elementSymptomsFile.put(symptom, numberOfSymptoms + 1);
		        }
			}
		return elementSymptomsFile;	 
	 }	

}
