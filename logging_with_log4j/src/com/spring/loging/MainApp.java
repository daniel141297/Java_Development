package com.spring.loging;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class MainApp {
	   static Logger log = Logger.getLogger(MainApp.class);
	   
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      log.info("Going to create HelloWord Obj");
	      
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      log.debug(obj, null);
	      obj.getMessage();
	     
	      log.info("Exiting the program");
	      
	      
	      log.trace("Trace Message!");  
	      log.debug("Debug Message!");  
	      log.info("Info Message!");  
	      log.warn("Warn Message!");  
	      log.error("Error Message!");  
	      log.fatal("Fatal Message!");  
	   }
	}