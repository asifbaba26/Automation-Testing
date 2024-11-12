package com.practice.testng;

import org.testng.annotations.Test;

@Test(groups="ClassTest")
public class GroupTestClasses_TestNG_Ex {

	@Test(priority = 1, groups = "Functional")
	public void bTest11() {
		System.out.println("Test 11");
	}

	@Test(priority = 2, groups = { "Functional", "Integration","Regression" })
	public void aTest22() {
		System.out.println("Test 22");
	}

	@Test(groups = "Integration")
	public void cTest33() {
		System.out.println("Test 33");
	}

	@Test(groups = {"Integration","System"})
	public void dTest44() {
		System.out.println("Test 44");
	}

}
