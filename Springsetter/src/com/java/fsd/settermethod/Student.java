package com.java.fsd.settermethod;

import java.util.List;

public class Student {
			List addressList;
			private Subject subject;
	
	public List getAddressList() {
		System.out.println("List elements :"+addressList);
		return addressList;
	}


	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}


	/*
	 * 
	 * 
	 * public Subject getSubject() { return subject; }
	 * 
	 * public void setSubject(Subject subject) { this.subject = subject; }
	 */
	/*
	 * private String StudentName; private int id;
	 * 
	 * 
	 * public Student(String studentName, int id) {
	 * 
	 * StudentName = studentName; this.id = id; }
	 * 
	 * 
	 * 
	 * public void display() {
	 * System.out.println("Student name and id is:"+StudentName+id); }
	 */
	public void callinsidebeanmethod() {
		subject.maths();
		
	}

}
