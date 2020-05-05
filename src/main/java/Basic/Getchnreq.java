package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getchnreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");
		
		
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
