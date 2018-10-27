package com.cg.apis;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.scp.businesslogic.Base;

public class GetCall extends Base {
	

	Base b ;
	
	@BeforeMethod
	public String getCall(){
	    
		b = new Base();
		RestAssured.baseURI=p.getProperty("host");
		
		Response res=given().
		param("page","2").
		when().
		get(p.getProperty("resource1")).
		then().
        assertThat().statusCode(200).extract().response();
		
		String s =res.asString();
		return s;
			
	}
	
	@BeforeMethod
	public String getCall2(){
	    
		b = new Base();
		RestAssured.baseURI=p.getProperty("host");
		
		Response res2=given().
        //RestAssured.baseURI=p.getProperty("host").
		//param("page","2").
		when().
		get(p.getProperty("resource2")).
		then().
        assertThat().statusCode(200).extract().response();
		
		String s2 =res2.asString();
		//System.out.println(s2);
	    return s2;
		
	}
   
	@BeforeMethod
    public String getCall3(){
	    
		b = new Base();
		RestAssured.baseURI=p.getProperty("host");
		
		Response res3=given().
        //RestAssured.baseURI=p.getProperty("host").
		//param("page","2").
		when().
		get(p.getProperty("resource3")).
		then().
        assertThat().statusCode(200).extract().response();
		
		String s3 =res3.asString();
		//System.out.println(s3);
	 	return s3;

	}


}
