package com.testng.listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.datasetup.BaseTest_DriverLaunch_Ex;

public class BrowserLaunch_Listeners_RetryFailCase extends BaseTest_DriverLaunch_Ex {
	
	@Test
	public void launchApp() {
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
//		Assert.assertTrue(false);  //wantedly failing the test
		
		driver.findElement(By.linkText("Motors")).click();
		
		driver.findElement(By.id("login")).click();  //giving undefined webelement to fail the script
	}

}
