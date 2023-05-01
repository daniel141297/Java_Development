package com.java.fsd.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String args[]) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("college",College.class);
		college.test();
		
		
	}

}
