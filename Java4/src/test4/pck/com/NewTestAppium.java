package test4.pck.com;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTestAppium {
 
  WebDriver driver;	
	
  @Test
  public void Test() {
	  
	  
  }
  
  @BeforeTest
  public void SetUp() throws MalformedURLException
  {
	 
	 //File application = new File("Resource/TheMallApp.apk");
	  
	DesiredCapabilities cap1 = new DesiredCapabilities();
	cap1.setCapability("browserName", "chrome");
	cap1.setCapability("platformName", "Android");
	cap1.setCapability("platformVersion", "6.0");
	cap1.setCapability("deviceName", "motorola-xt1706-HKE6P8X5");
	cap1.setBrowserName("chrome");
	
	
	 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap1);
	// new RemoteWebDriver(desiredCapabilities)
	 driver.get("https://www.facebook.com/login/");
	  
  }
  
}
