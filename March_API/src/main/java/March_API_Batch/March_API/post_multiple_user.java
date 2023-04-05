package March_API_Batch.March_API;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class post_multiple_user 
{ String Bodydata ="", value="";
	public Response user() throws FileNotFoundException
	{
		m1();
//		File f=new File("../March_API/Test2.json");
//		FileReader rd=new FileReader(f);
//		JSONTokener tk=new JSONTokener(rd);
//		JSONObject ob=new JSONObject(tk);
//		String Bodydata=ob.toString();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of ID");
		String id = sc.nextLine();
		Bodydata = Bodydata.replaceAll(Pattern.quote("{{id}}"),id);
		
		System.out.println("Please enter the value of FirstName");
		String FirstName = sc.nextLine();
		Bodydata = Bodydata.replaceAll(Pattern.quote("{{FirstName}}"),FirstName);
		
		System.out.println("Please enter the value of LastName");
		String LastName = sc.nextLine();
		Bodydata = Bodydata.replaceAll(Pattern.quote("{{LastName}}"),LastName);
		
		System.out.println("Please enter the value of Age");
		String Age = sc.nextLine();
		Bodydata = Bodydata.replaceAll(Pattern.quote("{{Age}}"),Age);
		
		System.out.println(" Please enter the value from list"
				+ "1. DeveopsStudentList\n"
				+ "APIStudentList\n"
				+ "SeleniumStudentList"
				);
				System.out.println("Please enter the value which you want to perform");
		 value = sc.nextLine();
		
		switch(value)
		{
		case "DeveopsStudentList":
			System.out.println("Please check the value of DeveopsStudentList");
			m1();
//			Response res = 
//					given()
//					.contentType(ContentType.JSON)
//					.body(Bodydata)
//					.when()
//			//.post(" http://localhost:3000/DeveopsStudentList");
//					.post(resources.S_Dev);
//			System.out.println("Status code is "+ res.statusCode());
//			System.out.println("Result value is \n"+ res.asString());
			break;
		case "APIStudentList":
			System.out.println("Please check the value of APIStudentList");
//			 res = 
//					given()
//					.contentType(ContentType.JSON)
//					.body(Bodydata)
//					.when()
//			.post("   http://localhost:3000/APIStudentList");
//			System.out.println("Status code is "+ res.statusCode());
//			System.out.println("Result value is \n"+ res.asString());
			m1();
			break;
		case "SeleniumStudentList":
//			System.out.println("Please check the value of SeleniumStudentList");
//			 res = 
//					given()
//					.contentType(ContentType.JSON)
//					.body(Bodydata)
//					.when()
//			.post("  http://localhost:3000/SeleniumStudentList");
//			System.out.println("Status code is "+ res.statusCode());
//			System.out.println("Result value is \n"+ res.asString());
			m1();
		default :
			System.out.println("Please enter proper value");
			}
		return user();
		
	}
	public void m1()throws FileNotFoundException
	{
		File f=new File("../March_API/Test2.json");
		FileReader rd=new FileReader(f);
		JSONTokener tk=new JSONTokener(rd);
		JSONObject ob=new JSONObject(tk);
		String Bodydata=ob.toString();
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(Bodydata)
		.when()
				if(value=="DeveopsStudentList")
				{
		.post(resources.S_Dev);
		System.out.println("Status code is "+ res.statusCode());
		System.out.println("Result value is \n"+ res.asString());
				}
				else if(value == "APIStudentList")
				{
					post("resources.S_API");
					System.out.println("Status code is "+ res.statusCode());
					System.out.println("Result value is \n"+ res.asString());
					
				}
				else
				{
					post("resources.S_S");
					System.out.println("Status code is "+ res.statusCode());
					System.out.println("Result value is \n"+ res.asString());
				}
		
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		post_multiple_user obj1=new post_multiple_user ();
		obj1.user();

	}
	}
