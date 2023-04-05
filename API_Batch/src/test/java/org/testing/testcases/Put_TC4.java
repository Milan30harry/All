package org.testing.testcases;

import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;

import java.util.Scanner;

public class Put_TC4 
{
	public Response put(String path)
	{
		JSONObject obj=new JSONObject();
		obj.put("FirstName", "JI2");
		obj.put("LastName", "Kitana");
	    obj.put("JOB", "TL");
	    
	    Response res=
	    given()
	    .contentType(ContentType.JSON)
	    .body(obj.toString())
	    .when()
	    .put(path);
	    System.out.println(res.statusCode()+res.statusLine());
	    System.out.println("API Put request result is "+ res.asString());
	    
	   
	    
	    return res;
	}
	
	public static void main(String[] args) 
	{
		Put_TC4 obj=new Put_TC4();
		System.out.println("Please enter the id which you want to perform put action");
	    Scanner sc = new Scanner(System.in);
	    String a= sc.next();
	    String b=a;
	    
	    if(a==b)
	    {
	    	
	    	String URL = "http://localhost:3000/DeveopsStudentList/";
		    //String b = a;
		    String path = URL.concat(a);  
	    	obj.put(path);
	    	
	    }else 
	    {
	    	 int number = Integer.parseInt( a ); 
	    	 String URL = "http://localhost:3000/DeveopsStudentList/";
			    //String b = a;
			    String path = URL.concat(a);  
		    	obj.put(path);
	    	 //obj.put(a);
	    }
	   
	    //System.out.println("http://localhost:3000/DeveopsStudentList/"+obj.a+"");
	    
	    
	}

}
