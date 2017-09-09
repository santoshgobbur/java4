package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.Login;
import com.org.Product;
import com.org.SignIn;
import com.org.SignUp;

public class NewTest {
  
  ChromeDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  SignUp ref1 = new SignUp(driver);
	  ref1.signup();
	  
	  
	  Login ref2 = new Login(driver);
	  ref2.login();
	  
	  SignIn ref3 = new SignIn(driver);
	  ref3.signin1();
	  
	  Product ref4 = new Product(driver);
	  ref4.product();
	  
	  Thread.sleep(8000);

	  
	  
 }
  
  @BeforeTest
  public void s(){
	  
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.tracko.co.in/");
  }
  
  //@AfterTest
  //public void p1(){
	  
	 // driver.quit();
	  
//  }
}
