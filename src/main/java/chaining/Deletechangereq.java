package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deletechangereq extends Basereq{

	
	@Test(dependsOnMethods="chaining.Createchangereq.createreq")
	public  void delreq() {
		
		
		Response response=RestAssured
				.given()
				.log().all()
				
				.delete(sys_id);
		
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();



	}

}
