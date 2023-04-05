package org.testing.testcases;

import static io.restassured.RestAssured.*;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post_ComplexTC4 
{
	public static void main(String[] args) 
	{
		
		JSONObject inner=new JSONObject();
		inner.put("FirstName", "Test1");
		inner.put("LastName", "Test");
		inner.put("Depart", "CBI");
		inner.put("ID",1);
		System.out.println("Given data is \n"+ inner.toString());
		
		JSONObject outer=new JSONObject();
		outer.put("testValue", "Pass");
		outer.put("inner data",inner);
		System.out.println();
		System.out.println(outer.toString());
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post(" http://localhost:3000/APIStudentList");
		System.out.println("API Response is"+ res.statusCode() + res.statusLine());
		System.out.println("Response of API is "+ res.asString());
		
		
		
		
	}

}
