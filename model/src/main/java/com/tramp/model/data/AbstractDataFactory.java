/** 
 * Project Name:model 
 * File Name:AbstractDataFactory.java 
 * Package Name:com.tramp.model.random 
 * Date:Sep 14, 2014 10:42:26 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.data;  
/** 
 * ClassName:AbstractDataFactory <br/> 
 * Function: 采用工厂模式来生产数据，这样可以配置多数据元，在有实际数据时，只要实现工厂的子类就行. <br/> 
 * Reason:   定义工厂模式的接口. <br/> 
 * Date:     Sep 14, 2014 10:42:26 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface AbstractDataFactory {
	/**
	 * 
	 * getFactorData:<br />
	 * 获取某指标的n 个数据
	 *
	 * @author zhaoyu
	 * @return
	 */
	public abstract double[] getFactorData();
}
 