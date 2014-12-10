/** 
 * Project Name:model 
 * File Name:DistanceAlgorithmContext.java 
 * Package Name:com.tramp.model.algorithm 
 * Date:Sep 14, 2014 2:46:49 PM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.algorithm;  

import com.tramp.model.data.AbstractDataFactory;

/** 
 * ClassName:DistanceAlgorithmContext <br/> 
 * Function: DistanceAlgorithmContext. <br/> 
 * Reason:   DistanceAlgorithmContext. <br/> 
 * Date:     Sep 14, 2014 2:46:49 PM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DistanceAlgorithmContext {
	
	private DistanceAlgorithm distanceAlgorithm;
	private AbstractDataFactory dataFactory;
	
	public DistanceAlgorithmContext(DistanceAlgorithm distanceAlgorithm, AbstractDataFactory dataFactory) {
		this.distanceAlgorithm = distanceAlgorithm;
		this.dataFactory = dataFactory;
	}
	
	/**
	 * 
	 * calculateDistance:<br />
	 * 计算两组数据的距离
	 *
	 * @author zhaoyu
	 * @param n 数据的大小
	 * @return
	 */
	public double calculateDistance() {
		double distance = 0.0;
		double[] data1 = this.dataFactory.getFactorData();
		double[] data2 = this.dataFactory.getFactorData();
		distance = this.distanceAlgorithm.calculateDistance(data1, data2);
		
		return distance;
	}
	
}
 