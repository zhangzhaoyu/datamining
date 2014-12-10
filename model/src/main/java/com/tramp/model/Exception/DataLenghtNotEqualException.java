/** 
 * Project Name:model 
 * File Name:DataLenghtNotEqualException.java 
 * Package Name:com.tramp.model.Exception 
 * Date:Sep 14, 2014 11:52:06 AM 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package com.tramp.model.Exception;  
/** 
 * ClassName:DataLenghtNotEqualException <br/> 
 * Function: DataLenghtNotEqualException. <br/> 
 * Reason:   DataLenghtNotEqualException. <br/> 
 * Date:     Sep 14, 2014 11:52:06 AM <br/> 
 * @author   zhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DataLenghtNotEqualException extends RuntimeException {
    /**
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 2998584597665145292L;

	public DataLenghtNotEqualException() {
        super();
    }
    
    public DataLenghtNotEqualException(String message) {
        super(message);
    }

    public DataLenghtNotEqualException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DataLenghtNotEqualException(Throwable cause) {
        super(cause);
    }
    
    protected DataLenghtNotEqualException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
 