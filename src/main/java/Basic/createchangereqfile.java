package Basic;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class createchangereqfile {

	public static void main(String[] args) {
		
		File jsonFile=new File("./data1.json");
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(jsonFile)
				.post();
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();


	}

}
