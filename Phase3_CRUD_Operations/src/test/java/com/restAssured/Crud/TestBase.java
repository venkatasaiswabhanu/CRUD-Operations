package com.restAssured.Crud;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	public static Response response;
	public static RequestSpecification httpRequest;
	
	public Logger logger;
	
	@BeforeClass
	
	public void setUp() {
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
}