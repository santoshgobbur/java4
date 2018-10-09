package com.testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest5 {
  
  @Test
  public void f() {
	        WebDriver driver;
	        System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
  }
}
