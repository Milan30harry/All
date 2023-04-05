package org.testing.testcases;
import static io.restassured.RestAssured.*;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class All2_method 
{
	public Response get1()
	{
		System.out.println("This is a get method .....\n\n");
		Response get=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/DeveopsStudentList");
		System.out.println(get.statusCode()+get.statusLine());
		System.out.println("API DevopsStudentList response is"+ get.asString());
		return get;
	}
	
	public Response Simple_Post1()

	{
		System.out.println("This is a POST method .....\n\n");
		JSONObject simple1=new JSONObject();
		simple1.put("First Name", "Milan");
		simple1.put("Last Name","Maheshwari");	
		//simple1.put("id","Test1");
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(simple1.toString())
		.post(" http://localhost:3000/DeveopsStudentList");
		System.out.println("Response code and message is ="+res.statusCode() + res.statusLine());
		System.out.println("Simple API Response is "+ res.asString());
		return res;
	}
	
	public Response complex_post()
	{
		JSONObject inner1 = new JSONObject();
		inner1.put("FirstName", "Check1");
		inner1.put("Last NAme", "Jack");
		//inner1.put("id","Test1");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("FirstName","DODO");
		inner2.put("LastName","Baby");
		inner2.put("Value of inner2",inner1);
		
		JSONObject outer1 = new JSONObject();
		outer1.put("FirstName","BAVBA");
		outer1.put("Last NAme","Joney");
		outer1.put("Value of outer", inner2);
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(outer1.toString())
		.post(" http://localhost:3000/DeveopsStudentList");
		System.out.println("Response status and code is"+ res.statusCode()+res.statusLine());
		System.out.println("The Response of API DevStudentList is "+ res.asString());
	return res;
	}
	
	public void Array_meth()
	{
		JSONObject inner3 = new JSONObject();
		inner3.put("FirstName","DON");
		inner3.put("LastName","TON");
		inner3.put("Designation","Boss");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("FirstName","DON2");
		inner2.put("LastName","TON2");
		inner2.put("Designation","Boss2");
		inner2.put("Value",inner3);
		
		JSONObject inner1 = new JSONObject();
		inner1.put("FirstName","DON3");
		inner1.put("LastName","TON3");
		inner1.put("Designation","Boss3");
		inner1.put("Value",inner2);
		
		JSONArray A=new JSONArray();
		A.put(0,inner1);
		A.put(1,inner2);
		A.put(2,inner3);
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(A.toString())
		.when()
		.post(" http://localhost:3000/DeveopsStudentList");
		System.out.println("API Status and code is"+res.statusCode()+ "  "+ res.statusLine() );
		System.err.println(res.asString());
		
	}
	public static void main(String[] args) 
	
	{
		All2_method obj=new All2_method();
		
		//obj.Simple_Post1();
		//obj.get1();
		//obj.complex_post();
		//obj.Array_meth();
		
		System.out.println("Please enter the action value which you want to perform");
		System.out.println("1.Simple_Post1\n2. complex_post \n3. Array_meth \n4. GetResult");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("The value of API Simple Post is ");
			obj.Simple_Post1();
		}
		else if(a== 2)
		{
			System.out.println("The value of API Complex Post is ");
			obj.complex_post();
			
		}
		else if(a== 3)
		{
			System.out.println("The value of API Array Post is ");
			obj.Array_meth();
			
		}else if(a==4)
		{
			System.out.println("The API get value is ");
			obj.get1();
			
		}else
			System.out.println("Please enter proper value"); 
				
		}
		
		
		
	}

