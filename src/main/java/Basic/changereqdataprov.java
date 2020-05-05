package Basic;

import java.io.File;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class changereqdataprov {
	
	@DataProvider(name="files",parallel=true)//,indices={0}
	public String[][] getFiles()

	{
		String[][] fileNames=new String[2][1];
		fileNames[0][0]="./data1.json";
		fileNames[1][0]="./data2.json";
		return fileNames;
		
	}
	@Test(dataProvider="files")
	public void createrequest(String filename)
	{
	File jsonFile=new File(filename);
	
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

