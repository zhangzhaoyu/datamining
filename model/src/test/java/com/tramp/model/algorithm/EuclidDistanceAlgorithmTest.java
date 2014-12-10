/** 
 * Project Name:model 
 * File Name:EuclidDistanceAlgorithmTest.java 
 * Package Name:com.tramp.model.algorithm 
 * Date:Sep 14, 2014 12:02:46 PM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.algorithm;  

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.tramp.model.data.AbstractDataFactory;
import com.tramp.model.data.RandomDataFactory;


/** 
 * ClassName:EuclidDistanceAlgorithmTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 14, 2014 12:02:46 PM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */

public class EuclidDistanceAlgorithmTest {
	
	private AbstractDataFactory dataFactory;

	@Before
	public void init() {
		dataFactory = new RandomDataFactory(20);
	}
	
	@Test
	public void testEuclidDistanceAlgorithm() {
		double[] data1 = dataFactory.getFactorData();
		double[] data2 = dataFactory.getFactorData();
		System.out.println(Arrays.toString(data1));
		System.out.println(Arrays.toString(data2));
		
		double distance = new EuclidDistanceAlgorithm().calculateDistance(data1, data2);
		System.out.println("the distance is :" + distance);
	}
}
 