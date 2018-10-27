package com.scp.businesslogic;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


import io.restassured.*;

public class D2 {
	
	@Test
	public void postRequest(){

		baseURI = "https://reqres.in";

		Response res=given().
		contentType(ContentType.JSON).
		header("Content-Type","application/json").
		body("{"+
    "\"email\": \"sydney@fife\","+
    "\"password\": \"pistol\""+
    "}").		
		when().
		post("/api/register").
		then().assertThat().statusCode(201).and().body("token",equalTo("QpwL5tke4Pnpja7X")).
		extract().response();
		
		String s = res.asString();
		System.out.println(s);
		
		JsonPath json = new JsonPath(s);
		System.out.println(json);
			
	}
}

