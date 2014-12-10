/** 
 * Project Name:model 
 * File Name:EuclidDistanceAlgorithm.java 
 * Package Name:com.tramp.model.algorithm 
 * Date:Sep 14, 2014 11:16:49 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.algorithm;  

import com.tramp.model.Exception.DataLenghtNotEqualException;

/** 
 * ClassName:EuclidDistanceAlgorithm <br/> 
 * Function: 欧几里得距离公式的实现. <br/> 
 * Reason:   欧几里得距离公式的实现. <br/> 
 * Date:     Sep 14, 2014 11:16:49 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class EuclidDistanceAlgorithm implements DistanceAlgorithm {

	public double calculateDistance(double[] data1, double[] data2) {
		if (data1.length != data2.length) {
			throw new DataLenghtNotEqualException("data length not equal.");
		}
		
		int size = data1.length;
		double sum = 0.0;
		for (int i=0; i<size; i++) {
			double temp = data1[i] - data2[i];
			sum += Math.pow(temp, 2.0);
		}
		return Math.sqrt(sum);
	}
	
}
 