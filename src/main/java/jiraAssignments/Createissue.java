package jiraAssignments;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Createissue extends Baserequest {

	@Test
	public void postissue() {

	File file=new File("./jira.json");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(file)
				.post("issue");
		

		int statuscode = response.getStatusCode();
		System.out.println(statuscode);

		JsonPath path = response.jsonPath();

		String issueid= path.get("issues.id");

		System.out.println(issueid);
		
		response.prettyPrint();
		

	}


}
		
		
		
		
		
		
		
		
		
		
		/*Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body("{\"short_description\":\"create issue request\"}")
				.post("issue");
		
		int  statuscode=response.getStatusCode();
		System.out.println("the status code is" +statuscode);

		long time=response.getTime();
		System.out.println("the time is" +time);

		System.out.println(response.getContentType());
		
		JsonPath jsonres=response.jsonPath();
		String issue_id=jsonres.get("issues.id");
		System.out.println(issue_id);*/
		


	


