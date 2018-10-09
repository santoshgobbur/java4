package com.testng;

import org.testng.annotations.Test;

public class Demo1 {
  
  @Test (groups ={"Sanity"})
  public void Login(){
	  
	  System.out.println("login successfully");
  }
  @Test (groups = {"Sanity","Regression"})
  public void CreateOrder(){
	  
	  System.out.println("order created");
  }
  @Test (groups ={"Regression"})
  public void EnterCredential(){
	  
	  System.out.println("credential entered");
  }
  @Test (groups ={"Regression"})
  public void SelectProduct(){
	  
	  System.out.println("product selected");
  }
  @Test (groups ={"Sanity"})
  public void Logout(){
	  
	  System.out.println("logout successfully");
  }


}

