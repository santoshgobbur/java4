package ListnerDemo;

//import org.omg.PortableServer.IMPLICIT_ACTIVATION_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MySecondTestCase {
	
	WebDriver driver;
	
	@Test
	public void VerifyErrorMessagePositiveTest() throws InterruptedException{
		
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(5000);
	  String ActualError = driver.findElement(By.id("spanMessage")).getAttribute("innerHTML");
	  String ExpectedError= "Username cannot be empty";
	 
	  Assert.assertEquals(ActualError,ExpectedError);
	  System.out.println("Test Case Passed");
	 
	  
 }
	
	@Test
	public void VerifyErrorMessageNegativeTest() throws InterruptedException{
		 
		  Thread.sleep(5000);
	 	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://opensource.demo.orangehrmlive.com/");
		
		  String ActualError = driver.findElement(By.id("spanMessage")).getAttribute("innerHTML");
		  String ExpectedError= "Username cannot be empt";
		 
		  Assert.assertEquals(ActualError,ExpectedError);
		  //System.out.println("Test Case Passed");
		  
		  // SoftAssert SA = new SoftAssert();
		  // SA.assertEquals(ActualTitle,ExpectedTitle );
		  // System.out.println("Test Case failed");
		  
	}

}
