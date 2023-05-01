package com.spring.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hellomethod(Model model) {
		String value="hello spring mvc";
		model.addAttribute("message", value);
		return "hello";
	}
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("hello", "command", new Student());
	   }
	
	@RequestMapping(value ="/addStudent",method = RequestMethod.POST)
	public String addStudent(Student student) {
		System.out.println("student data");
		System.out.println(student.getName());
		
		return null;
		
	}
	 @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect1() {
	     
	      return "redirect:/pages/final.html";
	   }
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
		   return "hello";
	   }
	   
	   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
	     
	      return "redirect:finalPage";
	   }
	   
	   @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	   public String finalPage() {
	     
	      return "student";
	   }

}
