package Basic;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getincidentsinxml {

	public static void main(String[] args) {
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");
		
		Map<String,String> parametersMap=new HashMap<String,String>();
		parametersMap.put("category", "software");
		parametersMap.put("priority", "1");
		parametersMap.put("sysparm_fields", "number,priority");
		
		//request to get

		Response response=RestAssured
				.given()
				.params(parametersMap)
				.accept(ContentType.XML)
				.get();
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		response.prettyPrint();

	}

}
