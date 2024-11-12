package com.practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BfAfClass_BfAfGroups_TestNG_Ex {

	@BeforeClass
	public void beforeClass() {
		System.out.println("data creation for methods 1 and 2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("data deletion for methods 1 and 2");
	}

	@BeforeGroups(groups = "regression")
	public void beforeGroups() {
		System.out.println("Run this before regression groups");
	}

	@AfterGroups(groups = "regression")
	public void afterGroups() {
		System.out.println("Run this after regression groups");
	}

	@Test(groups = { "regression", "integration" })
	public void method1() {
		System.out.println("Method 1");
	}

	@Test(groups = "fnctional")
	public void method2() {
		System.out.println("Method 2");
	}

}
