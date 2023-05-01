package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.FactoryService;
import com.spring.service.ShapeService;

public class AppMain {
	
public static void main(String args[]) {
	// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	FactoryService factoryService = new FactoryService();
	ShapeService shapeService=(ShapeService)factoryService.getBean("shapeService");
	//shapeService.getTriangle().setName("Dummy");
	 //ShapeService shape=context.getBean("shapeService",ShapeService.class);
	//shapeService.getTriangle().getName();
	shapeService.getCircle();
}

}
