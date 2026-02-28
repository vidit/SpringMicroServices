package com._mini.rest.web.services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController

public class HelloWorldController {

	//hello-world
	
	// Need to Return Hello World
	
	//@RequestMapping(method = RequestMethod.GET, path ="/hello-world")
	@GetMapping(path = "hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
