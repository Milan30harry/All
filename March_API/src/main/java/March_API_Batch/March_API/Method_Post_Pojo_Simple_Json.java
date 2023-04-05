package March_API_Batch.March_API;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Method_Post_Pojo_Simple_Json 
{

	public static void main(String[] args) 
	{
		Address ad=new Address();
		ad.setHouseNo("22");
		ad.setStreet("Chowk test");
		ad.setPhoneNo("9916006254");
		
		Baseclass obj=new Baseclass();
		obj.setFirstName("Milan");
		obj.setLastName("Potter");
		obj.setDesignation("Sr.QA");
		obj.setId("Hello6");
		obj.setAddress(ad);
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("  http://localhost:3000/DeveopsStudentList");
		System.out.println("Status of file is "+res.statusCode() );
		System.out.println("Value is "+ res.asString());
		
		
	}
}
