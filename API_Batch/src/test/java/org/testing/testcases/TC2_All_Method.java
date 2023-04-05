package org.testing.testcases;

import static io.restassured.RestAssured.*;

import java.util.Scanner;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TC2_All_Method 
{
	
	public Response SeleniumStudentList()
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/SeleniumStudentList");
				System.out.println("Status code is "+ res.statusCode());
				System.out.println("Response data is \n");
				System.out.println(res.asString());
		return res;
	}

	public Response APIStudentList()
	{
		Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/APIStudentList");
			System.out.println("Status of API is "+ res.statusCode());
			System.out.println("API Output for API Studentlist is"+"\n"+ res.asString());				
		return res;
	}
	public Response DeveopsStudentList()
	{
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/DeveopsStudentList");
		System.out.println("API status is "+ res.statusCode());
		System.out.println("API DevopsStudentlist result is "+"\n"+ res.asString());
		return res;
	}
	public static void main(String[] args) 
	{
		TC2_All_Method obj=new TC2_All_Method();
		//obj.SeleniumStudentList();
		/*
		 * obj.APIStudentList();
		 obj.DeveopsStudentList(); 
		 */
		
		System.out.println("Enter the value of API which you want to execute");
		Scanner s=new Scanner(System.in);
		int day=s.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("This is APIStudentList");
			System.out.println(" ");
			obj.APIStudentList();
			break;
		case 2:
			System.out.println("This is SeleniumStudentList");
			obj.SeleniumStudentList();
			break;
		case 3:
			System.out.println("This is DeveopsStudentList");
			obj.DeveopsStudentList();
			break;
			default :
				System.out.println("Please enter the proper value");
		
	}
}}