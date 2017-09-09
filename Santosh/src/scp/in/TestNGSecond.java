package scp.in;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGSecond {
  
	ChromeDriver d;
  @Test (priority=-3)
  public void f1() {
	  System.out.println("hi C");
  }
 
  @Test(dependsOnMethods = "f3")
  public void f2() {
	  System.out.println("hi D");
	  
  }
  
  @Test
  public void f3() {
	  System.out.println("hi E");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hi A");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("hi B");
	  
  }

}
