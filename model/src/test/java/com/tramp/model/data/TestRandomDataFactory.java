/** 
 * Project Name:model 
 * File Name:TestRandomDataFactory.java 
 * Package Name:com.tramp.model.data 
 * Date:Sep 14, 2014 10:55:54 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.data;  

import java.util.Arrays;

import junit.framework.TestCase;

/** 
 * ClassName:TestRandomDataFactory <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 14, 2014 10:55:54 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TestRandomDataFactory extends TestCase {

	
	public void testGetFactorData() {
		AbstractDataFactory dataFactory = new RandomDataFactory(20);
		double[] data = dataFactory.getFactorData();
		System.out.println(Arrays.toString(data));
		double[] data2 = dataFactory.getFactorData();
		System.out.println(Arrays.toString(data2));
	}

}
 