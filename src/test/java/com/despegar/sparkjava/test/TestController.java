package com.despegar.sparkjava.test;

import static spark.Spark.get;
import static spark.Spark.head;

import spark.Request;
import spark.Response;

/**
 * The class that defines a Spark Web Framework route
 * @author fwasy
 *
 */
public class TestController {

	public TestController() {
		get("/test", (request, response) ->  this.testMethod(request, response));
		head("/test", (request, response) ->  this.testHeadMethod(request, response));
	}
	
	public String testMethod(Request request, Response response) {
		return "This works!";
	}
		
	public String testHeadMethod(Request request, Response response) {
		response.header("foo", "bar");
		return "";
	}
	
}