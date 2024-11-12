package com.practice.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert_Title_Text_Ebay_Ex {
	
    @Test
	public void title_text_Test() {
    	
    	SoftAssert softassert = new SoftAssert();

		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		String expectedtext = "Search";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		
		String actualtitle = driver.getTitle();
		
		String actualtext = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
		
		softassert.assertEquals(actualtitle, expectedtitle,"Title verification failed");
		
		softassert.assertEquals(actualtext, expectedtext,"Text verification failed");
		
		driver.close();
		
		softassert.assertAll(); //to report the assertion failures

	}

}
