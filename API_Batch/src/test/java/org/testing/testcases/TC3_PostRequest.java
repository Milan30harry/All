// Simple json object example

package org.testing.testcases;
import static io.restassured.RestAssured.*;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC3_PostRequest 
{

public static void main(String[] args) 
{
	JSONObject js=new JSONObject();
	js.put("Name","Hello");
	js.put("LastName", "Potter");
	js.put("age",10);
	js.put("id","tt1");
	System.out.println("The given data is =\n"+ js.toString());
	
	Response res = 
	given()
	.contentType(ContentType.JSON)
	.body(js.toString())
	.when()
	//.post("http://localhost:3000/APIStudentList");
	.post("http://localhost:3000/DeveopsStudentList");
	System.out.println(res.statusCode());
	System.out.println(res.statusLine());
	System.out.println(res.asString());
	
	
	
}
}
