package test4.pck.com;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
  @BeforeTest
  public void SetUp() throws MalformedURLException{
	  
 DesiredCapabilities cap = DesiredCapabilities.chrome();
	  
	  cap.setBrowserName("chrome");
	  cap.setPlatform(Platform.WIN8);
	  driver = new RemoteWebDriver(new URL("http://192.168.0.7:5555/wd/hub"), cap);
			  
	  driver.get("http://opensource.demo.orangehrmlive.com/");
  }
 
	
  @Test
  public void Login() {
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  driver.findElement(By.id("btnLogin")).click();
	 }
  

  
  }


