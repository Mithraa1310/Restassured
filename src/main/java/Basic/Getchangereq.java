package Basic;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Getchangereq {

	public static void main(String[] args) {

		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

		Response response=RestAssured.get();
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());

		JsonPath path=response.jsonPath();

		List<String> listofrequests=path.getList("result.number");
		System.out.println(listofrequests.size());






	}

}
