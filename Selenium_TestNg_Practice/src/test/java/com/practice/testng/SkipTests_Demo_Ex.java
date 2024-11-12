package com.practice.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTests_Demo_Ex {

	boolean databaseSetup = true;

	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping the test as its implementation is not completed");
	}

	@Test
	public void skipTest2() {
		System.out.println("Skipping the test forcefully");
		throw new SkipException("Skipping this test");
	}

	@Test
	public void skipTest3() {
		System.out.println("Skipping the test based on condition");
		if (databaseSetup == true) {
			System.out.println("Execute the Test");
		} else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}

}
