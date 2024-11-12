package com.testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG_Ex implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Listeners Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listeners Test failed");
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}

}
