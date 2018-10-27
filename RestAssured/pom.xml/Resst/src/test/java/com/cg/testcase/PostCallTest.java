package com.cg.testcase;

import java.util.HashMap;

import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;

import com.cg.apis.PostCall;

public class PostCallTest extends PostCall {
	
	PostCall obj;
	
	@Test
	public void validatePostBody(){
		
		obj = new PostCall();
		JsonPath jp = new JsonPath(obj.postCall());
		
		System.out.println(jp.get("name"));
		
        HashMap<Object,Object> p = new HashMap<Object,Object>();
        
        p.put("name", jp.get("name"));
        p.put("job", jp.get("job"));
        p.put("createdAt", jp.get("createdAt"));
        System.out.println(p);
		
	}

}
