package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Createchangereq extends Basereq{

	
	@Test
	public void createreq() {
		
	
		Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body("{\"short_description\":\"create change request\"}")
				.post();
		
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		
		JsonPath jsonres=response.jsonPath();
		sys_id=jsonres.get("result.sys_id");
		System.out.println(sys_id);
		

	}

}
