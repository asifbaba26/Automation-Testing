package com.testng.dataprovider;

import org.testng.annotations.Test;

public class Data_from_DataProvider_AllData_Ex {

	@Test(dataProvider = "dataProvider1", dataProviderClass = DataProvider_AllData_SingleFile.class)
	public void test1(String username, String password) {

		System.out.println("Username:" + username + "," + "Password:" + password);

	}

	@Test(dataProvider = "dataProvider1", dataProviderClass = DataProvider_AllData_SingleFile.class)
	public void test2(String username, String password,String gender) {

		System.out.println("Username:" + username + "," + "Password:" + password+ "," + "Gender:" + gender);

	}

}
