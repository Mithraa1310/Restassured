package Basic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getincident2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		ValidatableResponse val=RestAssured
				.given()
				.queryParam("sysparm_fields","number,sys_id,severity")
				.when()
				.get()
				.then()
				.statusCode(200);
		
		//val.prettyPrint();
	}

}
