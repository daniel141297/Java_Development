package com.spring.model;

public class Triangle {
	private String name;

	public String getName() {
		//System.out.println("Target method");
		return name;
	}

	public void setName(String name) {
		System.out.println("Target method");
		this.name = name;
	
	}
	/*
	 * public void setNamereturnvalue(String name) {
	 * System.out.println("triangle return method method"); this.name = name;
	 * //return name; }
	 */

}
