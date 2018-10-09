package test4.pck.com;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=test4.pck.com.Sam2.class)
public class Sam1 {
  
  @Test
  public void f1() {
	  System.out.println("inside f1");
  }
  
  @Test
  public void f2() {
	  System.out.println("inside f2");
  }
  @Test
  public void f3() {
	  try{
		  System.out.println(10/0);
	  }
	  catch(NullPointerException e)
	  {
		  	  }
  }
  @Test(dependsOnMethods="f3")
  public void f4() {
	  System.out.println("inside f4");
  }
}
