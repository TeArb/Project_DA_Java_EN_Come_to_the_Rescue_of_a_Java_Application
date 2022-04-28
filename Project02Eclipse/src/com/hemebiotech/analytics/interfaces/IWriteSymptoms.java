/**
*
*  @author TeArb
*  @version 1
*/
package com.hemebiotech.analytics.interfaces;

import java.util.TreeMap;

public interface IWriteSymptoms {
	/**
	 * 
	 * @param write all Symptoms obtained from a data source in new file result
	 */
	void writeResult(TreeMap<String, Integer> treemap);

}
