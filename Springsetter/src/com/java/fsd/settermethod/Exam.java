package com.java.fsd.settermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	 public static void main(String args[]) {
			/*
			 * Student student = new Student(); student.setStudentName("daniel");
			 * student.display();
			 */
			/*
			 * ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			 * Student dani=context.getBean("student",Student.class); dani.display();
			 * Student raju=context.getBean("alex",Student.class); raju.display(); Student
			 * r=context.getBean("j",Student.class); r.display();
			 */
		 
			/*
			 * Student dani=new Student("daniel",7); dani.display();
			 */
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 Student dani=context.getBean("student",Student.class); 
		 dani.getAddressList();
		
		   	 }
}
