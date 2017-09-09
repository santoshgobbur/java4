package com.trs.xyz;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestJava3 {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suite of first class");
	}
    @AfterSuite
    public void as()
    {
    	System.out.println("after suite of first class");
    }
    @BeforeMethod
    public void bm(){
    	System.out.println("before method of first class");
    }
    @AfterMethod
    public void am(){
    	System.out.println("after method of first class");
    }
    @BeforeClass
    public void bc(){
    	System.out.println("before class of first class");
    }
    @AfterClass
    public void ac(){
    	System.out.println("after class of first class");
    }
    @AfterTest
    public void at(){
    	System.out.println("after test of first class");
    }
    @BeforeTest
    public void bt(){
    	System.out.println("before test of first class");
    }
    @Test
    public void t(){
  	System.out.println("test of first class");
  	
  }
}
