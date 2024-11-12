package com.practice.testng;

import org.testng.annotations.Test;

import common.datasetup.CommonDataSetup;

public class Login_CommonDataSetup_Extends_Ex extends CommonDataSetup {
	
	@Test(priority=1,description="This is Priority 1")
	public void bloginTest() {
		System.out.println("Login Success");
	}
	
	@Test(priority=2,description="This is Priority 2")
	public void alogoutTest() {
		System.out.println("Logout Success");
	}

}
