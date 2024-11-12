package com.practice.testng;

import org.testng.annotations.Test;

@Test(groups="ClassTest")
public class GroupTestCases_TestNG_Ex {

	@Test(priority = 1, groups = "Functional")
	public void bTest1() {
		System.out.println("Test 1");
	}

	@Test(priority = 2, groups = { "Functional", "Integration","Regression" })
	public void aTest2() {
		System.out.println("Test 2");
	}

	@Test(groups = "Integration")
	public void cTest3() {
		System.out.println("Test 3");
	}

	@Test(groups = {"Integration","System"})
	public void dTest4() {
		System.out.println("Test 4");
	}

}
