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

public class NewTestJava4 {
	
	
	@BeforeSuite
	public void bs2()
	{
		System.out.println("before suite of second class");
	}
    @AfterSuite
    public void as2()
    {
    	System.out.println("after suite of second class");
    }
    @BeforeMethod
    public void bm2(){
    	System.out.println("before method of second class");
    }
    @AfterMethod
    public void am2(){
    	System.out.println("after method of second class");
    }
    @BeforeClass
    public void bc2(){
    	System.out.println("before class of second class");
    }
    @AfterClass
    public void ac2(){
    	System.out.println("after class of second class");
    }
    @AfterTest
    public void at2(){
    	System.out.println("after test of second class");
    }
    @BeforeTest
    public void bt2(){
    	System.out.println("before test of second class");
    }
    @Test
    public void t2(){
  	System.out.println("test of second class");
  }

}
