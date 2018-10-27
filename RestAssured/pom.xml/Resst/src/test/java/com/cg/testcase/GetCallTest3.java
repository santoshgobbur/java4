package com.cg.testcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import com.cg.apis.GetCall;

public class GetCallTest3 {
   
	GetCall obj3;
	JsonPath js3;
	
	@Test(priority=3)
	public void validateBody(){
		
		  obj3 = new GetCall();
		  js3 = new JsonPath(obj3.getCall3());
		  System.out.println(js3.get("page"));
		  System.out.println(js3.get("per_page"));
		  System.out.println(js3.get("total"));
		  System.out.println(js3.get("total_pages"));
		 
		  HashMap<Object,Object> h3 = new HashMap<Object,Object>();
			 
		  for(int i=0;i<=2;i++){
	   	   
	  	    h3.put("color",js3.get("data["+i+"].color"));
	  	    h3.put("year",js3.get("data["+i+"].year"));
	  	    h3.put("name",js3.get("data["+i+"].name"));
	        h3.put("id",js3.get("data["+i+"].id"));
	        h3.put("pantone_value",js3.get("data["+i+"].pantone_value"));
	        System.out.println(h3);
	            
		    }	
		  
  }
}
