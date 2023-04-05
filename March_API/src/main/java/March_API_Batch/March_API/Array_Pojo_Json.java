package March_API_Batch.March_API;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Array_Pojo_Json 
{
	public static void main(String[] args) 
	{
		Address1[] add=new Address1[2];
		add[0]=new Address1();
		
		add[0].setHouseNo("33");
		add[0].setStreet("checkpoint");
		add[0].setType("par");
		
		
		add[1].setHouseNo("2");
		add[1].setStreet("chpoint");
		add[1].setType("parmanent");
		
		
		Basic1 bs=new Basic1();
		bs.setHoNo("123");
		bs.setSt("TestCheck");
		bs.setPhNo("87654345");
		bs.Address1(add);
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(bs)
		.when()
		.post(" http://localhost:3000/APIStudentList");
		System.out.println("File status is "+ res.getStatusCode());
		System.out.println("File value is "+ res.asString());
		
		
	}

}
