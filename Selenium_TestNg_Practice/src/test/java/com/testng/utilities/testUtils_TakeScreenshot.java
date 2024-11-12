package com.testng.utilities;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.datasetup.BaseTest_DriverLaunch_Ex;

import java.io.File;
import java.io.IOException;

public class testUtils_TakeScreenshot extends BaseTest_DriverLaunch_Ex {
	
	public void getScreenshot() throws IOException {
		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(' ', '-').replace(':', '-');
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File(".//screenshot//"+screenshotfilename+".png");
		
		FileUtils.copyFile(screenshotFile,destFile );
		
	}

}
