import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_1 {
	
	@Test
	
	public void GetAPI(){
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("https://reqres.in/api/users?page=2");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		String output = response.getBody().toString();
		
		System.out.println(output);
		
	}

}
