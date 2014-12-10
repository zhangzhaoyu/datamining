/** 
 * Project Name:model 
 * File Name:DistanceAlgorithmContextTest.java 
 * Package Name:com.tramp.model.algorithm 
 * Date:Sep 14, 2014 2:51:57 PM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.algorithm;  

import com.tramp.model.data.AbstractDataFactory;
import com.tramp.model.data.RandomDataFactory;

/** 
 * ClassName:DistanceAlgorithmContextTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 14, 2014 2:51:57 PM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DistanceAlgorithmContextTest {

	private static int SIZE = 100000;
	
	public static void main(String[] args) {

		DistanceAlgorithm distanceAlgorithm = new EuclidDistanceAlgorithm();
		AbstractDataFactory dataFactory = new RandomDataFactory(20);
		
		DistanceAlgorithmContext algorithmContext = new DistanceAlgorithmContext(distanceAlgorithm, dataFactory);
		
		for (int i=0; i<SIZE; i++) {
			double distance = algorithmContext.calculateDistance();
			if (distance < 1.0) {
				System.out.println("distance is : " + distance);
			}
			
		}
		
		
	}

}
 