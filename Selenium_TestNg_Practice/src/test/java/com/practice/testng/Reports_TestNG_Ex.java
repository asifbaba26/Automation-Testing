package com.practice.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reports_TestNG_Ex {

	@Test
	public void Test1() {
		Reporter.log("This is Test 1");
		System.out.println("This is Test 1");
	}

	@Test
	public void Test2() {
		Reporter.log("This is Test 1");
		System.out.println("This is Test 2");
	}

	@Test
	public void Test3() {
		Reporter.log("This is Test 1");
		System.out.println("This is Test 3");
	}

	@Test
	public void Test4() {
		Reporter.log("This is Test 1");
		System.out.println("This is Test 4");
	}

}
