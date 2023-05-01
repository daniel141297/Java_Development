package com.spring.service;

import com.spring.aspect.Loggable;
import com.spring.model.Circle;
import com.spring.model.Triangle;

public class ShapeService {
	private Circle circle; 
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		System.out.println("proxy method");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
