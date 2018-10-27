package com.scp.businesslogic;

import static io.restassured.RestAssured.*;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.sun.xml.xsom.parser.JAXPParser;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;


class D1 {

	public static void main(String[] args) throws JSONException {

		RestAssured.baseURI="https://reqres.in";
		//baseURI = "https://reqres.in";
		
        Response res=given().
		param("page","2").
		when().
		get("/api/users?page=2").
	    then().
	           assertThat().statusCode(200).and().contentType(ContentType.JSON).
	           //and().body("data[0].last_name",equalTo("Holt")).and().body("data[1].first_name",equalTo("Charles")).
	           extract().response();
        
       String s = res.asString();
      // System.out.println(s);
        
       JsonPath json = new JsonPath(s);
     
//       int a=json.getInt("data[1].id");
//       System.out.println(a);
       
       HashMap<Object,Object> hp = new HashMap<Object,Object>();
      
       for(int i=0;i<=2;i++){
    	   
    	    hp.put("avatar",json.get("data["+i+"].avatar"));
    	    hp.put("last_name",json.get("data["+i+"].last_name"));
    	    hp.put("first_name",json.get("data["+i+"].first_name"));
            hp.put("id",json.get("data["+i+"].id"));
            System.out.println(hp);
              
	    } 
   
	}
	
}
