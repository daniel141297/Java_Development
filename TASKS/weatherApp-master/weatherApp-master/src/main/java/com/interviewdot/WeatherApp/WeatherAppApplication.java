package com.interviewdot.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class WeatherAppApplication {

	 @GetMapping(value = "/dan")
	    public String index() {
	    	return "index.html";
	    }
	    
	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

}
