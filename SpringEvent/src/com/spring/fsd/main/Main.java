package com.spring.fsd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.fsd.config.AppConfig;
import com.spring.fsd.publisher.AmazonPrime;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		AmazonPrime movie=context.getBean("amazonPrime",AmazonPrime.class);
		movie.streamKGF("Chapter No -2");
		//movie.streamKGF("Chapter No -2"); worked fine
		
	}

}
