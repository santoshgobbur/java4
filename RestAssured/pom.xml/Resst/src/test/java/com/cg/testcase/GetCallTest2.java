package com.cg.testcase;

import io.restassured.path.json.JsonPath;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.cg.apis.GetCall;

public class GetCallTest2 extends GetCall {
    
	GetCall obj2;
	JsonPath js2;
	
	@Test(priority=2)
	public void validateBody(){
		
	  obj2 = new GetCall();
	  js2 = new JsonPath(obj2.getCall2());
	  //System.out.println(js2.get("data.id"));
	  
   HashMap<Object,Object> h2 = new HashMap<Object,Object>();
   
   h2.put("id", js2.get("data.id"));
   h2.put("first_name", js2.get("data.first_name"));
   h2.put("last_name", js2.get("data.last_name"));
   h2.put("avatar", js2.get("data.avatar"));
   System.out.println(h2);
	  
	  	
	}
}
