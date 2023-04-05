package org.testing.testcases;
import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Array_Post_TC5 
{
	public static void main(String[] args) 
	
	{
		JSONObject inner3 = new JSONObject();
		inner3.put("Message","Welecome to inner 3");
		inner3.put("Admin","Admin3");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("UserName","GO");
		inner2.put("PAssword",1234);
		inner2.put("Message","Welecome to inner 2");
		inner2.put("Admin2",inner3);
		
		JSONObject inner1 = new JSONObject();
		inner1.put("FirstName","M1");
		inner1.put("LastName","Potter");
		inner1.put("Message","Welecome to inner 1");
		inner1.put("Admin1",inner2);
				
		JSONArray Array = new JSONArray();
		Array.put(0,inner3);
		Array.put(1,inner2);
		Array.put(2,inner1);
		
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(Array.toString())
		.when()
		.post("http://localhost:3000/APIStudentList");
		System.out.println(res.statusCode());
		System.out.println(res.statusLine());
		System.out.println("API value is "+ res.asString());
		
		
		
	}
	
	

}
