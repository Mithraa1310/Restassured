package jiraAssignments;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Getissues extends Baserequest{

	
	@Test
	public void getissue()
	{
		Response response= RestAssured
				.given()
				.log()
.all()
.contentType(ContentType.JSON)	
.get("search?jql=project='MAR'");


		response.prettyPrint();
		
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
	
		
		JsonPath path=response.jsonPath();
		
		
		List<String> issuesall=path.getList("issues.id");
		Collections.sort(issuesall);
		System.out.println(issuesall.get(0));
		

}
}