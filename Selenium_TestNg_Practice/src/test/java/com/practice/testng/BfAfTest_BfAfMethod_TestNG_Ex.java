package com.practice.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BfAfTest_BfAfMethod_TestNG_Ex {

	@BeforeTest
	public void login() {
		System.out.println("Login");
	}

	@AfterTest
	public void logout() {
		System.out.println("Logout");
	}

	@BeforeMethod
	public void dbConnect() {
		System.out.println("Database connected");
	}

	@AfterMethod
	public void dbDisconnect() {
		System.out.println("Database disconnected");
	}

	@Test
	public void method1() {
		System.out.println("Method 1");
	}

	@Test
	public void method2() {
		System.out.println("Method 2");
	}

}
