package com.restAssured.Crud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETRequest extends TestBase {
	
	@Test
	public void verifyAllUsers() {
		RestAssured 
			.when()
				.get("https://reqres.in/api/users?page=2")
				
			.then()
				.assertThat()
				.statusCode(200)
			.and()
				.log().all();
		logger.info("Got All Users Data");
	
	}
}
