package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.ModelMap;

@Controller

public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String printHello(ModelMap model) {
		// model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}