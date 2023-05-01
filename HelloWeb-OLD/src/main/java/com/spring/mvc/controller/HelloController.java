package com.spring.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hellomethod(Model model) {
		String value="hello spring mvc";
		model.addAttribute("message", value);
		
		return "hello";
	}

}
