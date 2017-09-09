package com.trs.xyz;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass{

  @Test(dataProvider="date")
  public void T1(Object x, Object y){
	  
	  System.out.println("-----"+x);
	  System.out.println("-----"+y);
  }
  
  @Test(dataProvider="month")
  public void T2(int a,String b){
	  System.out.println("----"+a);
	  System.out.println("----"+b);
	   }
 
  @DataProvider(name="date")
  public Object[][] d(){
	  
	  return new Object[][]
			  {
			  new Object[] {"santosh","saurab"},
			  new Object[] { 15,10},
			  };
	 
  }
 
  @DataProvider(name="month")
  public Object[][] m(){
	  
	  return new Object[][]
			  {
			new Object[] {8, "August"},
			new Object[] {9, "September"},
			new Object[] {10, "October"},
			  };
	  }

  
  @DataProvider(name="year")
  public void y(){
	  
  }
}
