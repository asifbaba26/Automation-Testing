package com.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Testng_Example {

	@Test(dataProvider = "dataSet")
	public void test(String username, String password) {

		System.out.println("Username:" + username + "," + "Password:" + password);

	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[2][2];

		// first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pwd1";

		// second row
		dataset[1][0] = "user2";
		dataset[1][1] = "pwd2";

		return dataset;

	}

	@Test(dataProvider = "data")
	public void test1(String username, String password) {

		System.out.println("Username:" + username + "," + "Password:" + password);

	}

	@DataProvider(name="data")
	public Object[][] dataSet1() {

		return new Object[][] { { "user3", "pwd3" }, { "user4", "pwd4" } };

	}

}
