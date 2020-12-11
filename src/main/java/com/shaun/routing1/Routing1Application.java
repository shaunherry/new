package com.shaun.routing1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class Routing1Application {

	public static void main(String[] args) {
		SpringApplication.run(Routing1Application.class, args);
	}
	
	@RequestMapping("/")
	public String CodingController() {
		return "Coding Controller";
	}
	
	@RequestMapping("/coding")
	public String coding() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "Python fricken rocks dude";
	}
	@RequestMapping("/coding/python/java")
	public String java() {
		return "Java-Spring is better!";
	}	

//	
	
	
	
	

}
