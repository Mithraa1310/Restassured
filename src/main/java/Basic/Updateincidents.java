package Basic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Updateincidents {

	public static void main(String[] args) {
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body("{\"short_description\":\"created by rest assured\"}")
				.put("96c0b01cdb0010100d2af7af2996198e");
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();

	}

}
