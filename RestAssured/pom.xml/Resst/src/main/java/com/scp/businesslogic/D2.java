package com.scp.businesslogic;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


import io.restassured.*;

public class D2 {
	
	@Test
	public void postRequest(){
		
		//RestAssured.baseURI = "";
		
		baseURI = "https://reqres.in";
		
		given().
		//param("Content-Type","application/json").
		body("{"+
    "\"email\": \"sydney@fife\","+
    "\"password\": \"pistol\""+
    "}").		
		
		when().
		post("https://reqres.in/api/register").
		then().assertThat().statusCode(400).and().body("token",equalTo("QpwL5tke4Pnpja7X"));
		
	
		
		
		
		
		
	}

}
