package com.cg.apis;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;

import com.cg.payloaddata.Post1;
import com.scp.businesslogic.Base;

public class PostCall extends Base{
  
	Post1 p1;
	
	@BeforeMethod
	public String postCall(){
		
		baseURI=p.getProperty("host");
		 p1 = new Post1();
		
		Response res1 = given().
				contentType(ContentType.JSON).
				body(p1.payloadData()).
				when().
				post(p.getProperty("rp1")).
                then().
                assertThat().statusCode(201).extract().response();
		
		String p1 = res1.asString();
		return p1;
		
		
                
				
				
	}
}
