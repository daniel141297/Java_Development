package com.java.fsd.required;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private String interesedCourse;
	private String hobby;
	
	
	
   @Required
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${student.interesedCourse}")
	public void setInteresedCourse(String interesedCourse) {
		this.interesedCourse = interesedCourse;
	}
	
	//@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void displayStudentInfo() {
		System.out.println("Student name: "+name);	
		System.out.println("Student interesedCourse: "+interesedCourse);	
		System.out.println("Student hobby: "+hobby);	
		}
}
