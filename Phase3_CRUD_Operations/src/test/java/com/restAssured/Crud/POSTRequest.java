package com.restAssured.Crud;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTRequest extends TestBase {
	
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createData() {
		map.put("name", "Venkata Sai Swabhanu");
		map.put("Job", "Softwaren Test Engineer Apprentice");
		logger.info("Payload Ready");
		
		RestAssured.baseURI ="https://reqres.in";
		RestAssured.basePath="/api/users";
		logger.info("URL Specified");
	}
	
	@Test
	public void createNewUser() {
		logger.info("Inside POST Method");
		
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
			.when()
				.post()
			.then()
				.assertThat()
				.statusCode(201)
			.and()
				.log().all();
		logger.info("Response Code Verified and New User added");

	}
	

}
