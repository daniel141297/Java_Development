package com.tutorialspoint.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody()
	@RequestMapping(value = "/home")
	public String home() {
		return "Hello World!";
	}
}
