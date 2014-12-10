/** 
 * Project Name:model 
 * File Name:DistanceAlgorithm.java 
 * Package Name:com.tramp.model.algorithm 
 * Date:Sep 14, 2014 2:08:50 PM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.algorithm;  
/** 
 * ClassName:DistanceAlgorithm <br/> 
 * Function: 采用策略模式来计算两组数据的距离，不同的时间方式只需要实现该接口. <br/> 
 * Reason:   采用策略模式来计算两组数据的距离. <br/> 
 * Date:     Sep 14, 2014 2:08:50 PM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface DistanceAlgorithm {
	/**
	 * 
	 * calculateDistance:<br />
	 * 距离公式求解距离
	 *
	 * @author zhaoyu
	 * @param data1 第一组数据
	 * @param data2 第二组数据
	 * @return 距离
	 */
	public double calculateDistance(double[] data1, double[] data2);
	
}
 