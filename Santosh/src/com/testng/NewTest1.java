package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest1{

	WebDriver driver;
	 @Test
	 @Parameters({"url"})
	 public void OrangeLaunch(String url){
		 
		// WebDriver driver;
		
		 System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get(url);
		 
	 }

	
}
