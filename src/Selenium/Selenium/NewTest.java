package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
 
  Webdriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://output.jsbin.com/usidix/1");
  }
}
