/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.TreeMap;

public interface ISortedSymptoms {
	/**
	 * 
	 * @return a sorted list of all Symptoms obtained from a data source
	 */
	TreeMap<String, Integer> sortSymptoms(List<String> listSymptom);
	
}
