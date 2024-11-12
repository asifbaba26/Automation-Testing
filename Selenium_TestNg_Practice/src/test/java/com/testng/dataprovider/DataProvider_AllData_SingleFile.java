package com.testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvider_AllData_SingleFile {

	@DataProvider
	public Object[][] dataProvider1(Method m) {

		Object[][] testdata = null;

		if (m.getName().equals("test1")) {  //to give two inputs for tet1()

			testdata = new Object[][] { { "user1", "pwd1" }, { "user2", "pwd2" } };

		} else if (m.getName().equals("test2")) { //to give three inputs for test2()

			testdata = new Object[][] { { "user3", "pwd3","male" }, { "user4", "pwd4","female" } };

		}
		return testdata;

	}

}
