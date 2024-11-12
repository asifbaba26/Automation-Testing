package com.testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testng.utilities.testUtils_TakeScreenshot;

public class Listeners_TakeFailScreenshot_TestNG extends testUtils_TakeScreenshot implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Listeners Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listeners Test Failed --- Capturing Screenshot");
		try {
			getScreenshot();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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
