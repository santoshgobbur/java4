package ListnerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;


public class MyFirstTestCase {
	
	WebDriver driver;
	
	@Test
	public void VerifyTitlePositiveTest(){
		
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  System.out.println(driver.getTitle());
	  String Actual_Title=driver.getTitle();
	  String Expected_Title = "OrangeHRM";
	  
	  Assert.assertEquals(Actual_Title,Expected_Title );
	  //System.out.println("Test Case Passed");
	  
 }
	
	@Test
	public void VerifyTitleNegativeTest() throws InterruptedException{
		 
		  Thread.sleep(5000);
	 	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://opensource.demo.orangehrmlive.com/");
		
		  String ActualTitle=driver.getTitle();
		  String ExpectedTitle = "OrangeHR";
		  
		  Assert.assertEquals(ActualTitle,ExpectedTitle );
		  
		 // SoftAssert SA = new SoftAssert();
		 // SA.assertEquals(ActualTitle,ExpectedTitle );
		  
		  System.out.println("Test Case failed");
		  
	}

}

