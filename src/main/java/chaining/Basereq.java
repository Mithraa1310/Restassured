package chaining;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class Basereq {
	
	public static String sys_id; 
	
	@BeforeSuite
	public void base()

	{
		RestAssured.baseURI="https://dev76455.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin","Confusingservice1");

	}
}
