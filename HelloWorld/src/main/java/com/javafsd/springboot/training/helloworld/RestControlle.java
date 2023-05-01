package com.javafsd.springboot.training.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControlle {
	@GetMapping(value = "/cities")
	public String viewProducts() {
	      return "view-products";
	}

	 @GetMapping(value = "/towns")
	public String addProducts() {
	      return "add-products";   
	}
}
