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

public class PostBodyDataJsonFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File f = new File("../March_API/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		
		String BodyData = j.toString();
		System.out.println("Please Entyer id value ");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		BodyData = BodyData.replaceAll(Pattern.quote("{{id}}"), i);
		// accessing file which we have created (bodyData.json)
	//	System.out.println("Entered data is \n"+ j.toString() ); 
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(BodyData)
		.when()
		.post(" http://localhost:3000/APIStudentList");
		//System.out.println("Status code is "+res.toString() );
		System.out.println(res.statusCode()+res.statusLine());
	    System.out.println("API Put request result is "+ res.asString());
		
		
	}

}
