package com.digitek.logins;

import org.apache.log4j.Logger;

public class LoggerExample {
	
	final static Logger log = Logger.getLogger(LoggerExample.class);
	
	

	public static void main(String[] args) {
		String methodName = "main";
		log.trace("Trace Message!" + methodName); 
		log.debug("Debug Message!"+ methodName); 
		log.info("Info Message!"+ methodName); 
		log.warn("Warn Message!"+ methodName); 
		log.error("Error Message!"+ methodName);
		
		

	}

}
