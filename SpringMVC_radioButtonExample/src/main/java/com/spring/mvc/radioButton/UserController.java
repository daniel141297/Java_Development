package com.spring.mvc.radioButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class UserController {
	 @RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView user() {
	      User user = new User();	  
		  user.setFavoriteFrameworks((new String []{"Spring MVC","Struts 2"}));
	      user.setGender("M");
		  ModelAndView modelAndView = new ModelAndView("user", "command", user);
		  return modelAndView;
	   }

	   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addUser(@ModelAttribute("SpringWeb")User user, 
	      ModelMap model) {
	      model.addAttribute("username", user.getUsername());
	      model.addAttribute("password", user.getPassword());
	      model.addAttribute("address", user.getAddress());
	      model.addAttribute("receivePaper", user.isReceivePaper());
		  model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
	      model.addAttribute("gender", user.getGender());
	      return "users";
	   }
	   
	   @ModelAttribute("webFrameworkList")
	   public List<String> getWebFrameworkList()
	   {
	      List<String> webFrameworkList = new ArrayList<String>();
	      webFrameworkList.add("Spring MVC");
	      webFrameworkList.add("Struts 1");
	      webFrameworkList.add("Struts 2");
	      webFrameworkList.add("Apache Wicket");
	      return webFrameworkList;
	   }
	   @ModelAttribute("countryList")
	   public Map<String, String> getCountryList() {
	      Map<String, String> countryList = new HashMap<String, String>();
	      countryList.put("US", "United States");
	      countryList.put("CH", "China");
	      countryList.put("SG", "Singapore");
	      countryList.put("MY", "Malaysia");
	      return countryList;
	   }
	   @ModelAttribute("skillsList")
	   public Map<String, String> getSkillsList() {
	      Map<String, String> skillList = new HashMap<String, String>();
	      skillList.put("Hibernate", "Hibernate");
	      skillList.put("Spring", "Spring");
	      skillList.put("Apache Wicket", "Apache Wicket");
	      skillList.put("Struts", "Struts");
	      return skillList;
	   }
}
