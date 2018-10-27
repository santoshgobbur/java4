package com.cg.testcase;

import java.util.HashMap;

import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;

import com.cg.apis.GetCall;

public class GetCallTest extends GetCall {
	
	GetCall obj;
	JsonPath js; 
	@Test(priority=1)
	public void validateBody(){
		
	  obj = new GetCall();
	  js = new JsonPath(obj.getCall());
	  
	  HashMap<Object,Object> hp = new HashMap<Object,Object>();
	 
	  for(int i=0;i<=2;i++){
   	   
  	    hp.put("avatar",js.get("data["+i+"].avatar"));
  	    hp.put("last_name",js.get("data["+i+"].last_name"));
  	    hp.put("first_name",js.get("data["+i+"].first_name"));
        hp.put("id",js.get("data["+i+"].id"));
        System.out.println(hp);
            
	    }	  
		
	}
}
