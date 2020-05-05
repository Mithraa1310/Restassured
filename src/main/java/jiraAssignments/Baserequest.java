package jiraAssignments;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class Baserequest {
public static String issueid; 
	
	@BeforeSuite
	public void base()

	{
		RestAssured.baseURI="https://api-mar2020.atlassian.net/rest/api/2/";
		RestAssured.authentication=RestAssured.preemptive().basic("rajalakshmi.govindarajan@testleaf.com","kEJxzmhkQzvdeP8iysWN2D1B");

	}

}
