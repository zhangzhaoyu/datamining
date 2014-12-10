/** 
 * Project Name:model 
 * File Name:RandomTest.java 
 * Package Name:com.tramp.model.data 
 * Date:Sep 14, 2014 11:06:24 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.data;  

import java.util.Random;

/** 
 * ClassName:RandomTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 14, 2014 11:06:24 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		for (int i=0; i<10; i++) {
			System.out.println(random.nextInt(100)/100.0);
		}
		System.out.println(Math.pow(3, 2));
	}
	
}
 