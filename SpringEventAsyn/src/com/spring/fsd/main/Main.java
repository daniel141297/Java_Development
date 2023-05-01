package com.spring.fsd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.fsd.config.AppConfig;
import com.spring.fsd.publisher.Gpay;

public class Main {
       public static void main(String args[]) {
    	  
    	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    		context.start();
    	
    	   Gpay bean=context.getBean("gpay",Gpay.class);
    		bean.sendmoney("Raju", 2000,true);
    		
    		context.stop();
    		context.close();
    	   
       }
}
