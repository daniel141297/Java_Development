package com.java.fsd.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.java.fsd.component")
public class CollegeConfig {
	
	
	@Bean
	public Principal principal() {
		Principal principal=new Principal();
		return principal;
		
	}
	@Bean
	public College college() {
		College college=new College(principal());
		return college;
		
	}
	

}
