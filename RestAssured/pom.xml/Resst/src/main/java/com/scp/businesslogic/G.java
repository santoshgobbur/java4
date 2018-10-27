package com.scp.businesslogic;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class G {

   @Test 
   public void post1(){
		
	   baseURI = "https://reqres.in";
		
		given().
		contentType(ContentType.JSON).
		header("Content-Type","application/json").
		body("{"+
    "\"name\": \"morpheus\","+
    "\"job\": \"zion resident\""+
    "}").
	when().
	post("/api/users/2").
	then().assertThat().statusCode(201).
	and().header("server", "cloudflare").
    and().header("x-powered-by", "Express");
    //and().header("etag", "W\"54-uH9DIa4peJPUMSgNJwKpHo7z5Zk\"");
	//and().body("id", equalTo("576")).
	//and().body("createdAt", equalTo("2018-10-12T16:41:31.017Z"));
		
		//"updatedAt": "2018-10-10T17:34:28.513Z"
		
	}

}
