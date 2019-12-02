package com.osa.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class AllAPICall {
	private static Logger log=AllAPICall.getLog(AllAPICall.class);
	public static void call() {
		log.info("This is from AllAPICall class log ");
		System.out.println("Extra work");
	}
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}

}
