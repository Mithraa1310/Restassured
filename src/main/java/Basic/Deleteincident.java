package Basic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Deleteincident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		Response response=RestAssured
				.given()
				.log().all()
				.pathParam("sys_id", "cfbf2050db0010100d2af7af299619cc")
				.delete("{sys_id}");
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();
		
		//cfbf2050db0010100d2af7af299619cc
	}

}

