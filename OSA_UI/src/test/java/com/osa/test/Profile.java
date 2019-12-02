package com.osa.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.osa.base.AllAPICall;

public class Profile {
	private static Logger log=AllAPICall.getLog(Profile.class);
	@Test
	public void test1() {
		log.info("This is from first test log ");
		
	}
	@Test
	public void test2() {
		log.info("This is from second test log ");
	
	}
	@Test
	public void test3() {
		AllAPICall.call();
	}
}
