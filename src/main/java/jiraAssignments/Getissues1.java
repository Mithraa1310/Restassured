package jiraAssignments;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Getissues1 extends Baserequest {

	@Test
	public void getissue1()
	{
		Response response= RestAssured
				.given()
				.log()
.all()
.contentType(ContentType.JSON)	
.get("/search?jql=project=\"MAR\"");


		response.prettyPrint();
		
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
		long time=response.getTime();
		System.out.println(time);
		
		JsonPath path=response.jsonPath();
		
		
		List<String> issuesall=path.getList("issues.id");
		issueid=issuesall.get(issuesall.size()-1);
		System.out.println(issueid);
		
}
}
