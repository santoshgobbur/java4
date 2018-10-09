package com.scp.businesslogic;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;


class D1 {

	public static void main(String[] args) {

		RestAssured.baseURI="https://reqres.in";
		//baseURI = "https://reqres.in";
		given().
		param("page","2").
		when().
		get("/api/users").
	    then().
	           assertThat().statusCode(200).and().contentType(ContentType.JSON).
	           and().body("data[0].last_name",equalTo("Hot")).and().body("data[1].first_name",equalTo("Eva"));
		}
}
