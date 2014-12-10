/** 
 * Project Name:model 
 * File Name:RandomDataFactory.java 
 * Package Name:com.tramp.model.random 
 * Date:Sep 14, 2014 10:46:39 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.data;  

import java.util.Random;

/** 
 * ClassName:RandomDataFactory <br/> 
 * Function: 模拟的随机数据生成器. <br/> 
 * Reason:   模拟的随机数据生成器. <br/> 
 * Date:     Sep 14, 2014 10:46:39 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class RandomDataFactory implements AbstractDataFactory {

	private Random random = null;
	private int size;
	
	public RandomDataFactory(int size) {
		this.random = new Random(System.currentTimeMillis()); 
		this.size = size;
	}
	
	public double[] getFactorData() {
		double[] data = new double[this.size];
		for (int i=0; i<this.size; i++) {
			data[i] = this.random.nextInt(100)/100.0;
		}
		return data;
	}
}
 