package Basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deletechangereq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		Response response=RestAssured
				
				.delete("0afc825adb3740100d2af7af2996199a");
		
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();



	}

}
