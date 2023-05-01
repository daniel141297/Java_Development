package com.tutorialspoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootServletfilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletfilterApplication.class, args);
	}
	 @RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World";
	   }
}
