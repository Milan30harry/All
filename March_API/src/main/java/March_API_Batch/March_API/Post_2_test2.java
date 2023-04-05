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

import static io.restassured.RestAssured.*;

public class Post_2_test2 {
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File f=new File("../March_API/Test2.json");
		FileReader rd=new FileReader(f);
		JSONTokener t=new JSONTokener(rd);
		JSONObject obj=new JSONObject(t);
		String BodyData = obj.toString();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the First Name");
		String FirstName = sc.next();
		System.out.println("Please Enter LastName");
		String LastName = sc.next();
		System.out.println("Please Enter Age");
		String Age = sc.next();
		System.out.println("Please Enter Id");
		String id = sc.next();
		
		
		BodyData = BodyData.replaceAll(Pattern.quote("{{id}}"),id );
		BodyData = BodyData.replaceAll(Pattern.quote("{{FirstName}}"),FirstName );
		BodyData = BodyData.replaceAll(Pattern.quote("{{LastName}}"),LastName );
		BodyData = BodyData.replaceAll(Pattern.quote("{{Age}}"),Age );
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(BodyData)
				.when()
				.post("http://localhost:3000/APIStudentList");
				//System.out.println("Status code is "+res.toString() );
				System.out.println(res.statusCode()+res.statusLine());
			    System.out.println("API Put request result is "+ res.asString());
		
	}

}
