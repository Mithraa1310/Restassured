package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getchnreq extends Basereq{

	@Test
	public  void getreq () {
		// TODO Auto-generated method stub
		
		
		
		//request to get

		Response response=RestAssured
				.get();
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		
		String data=response.asString();
		System.out.println(data);
		//response.prettyPrint();

	}

}
