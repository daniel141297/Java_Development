package com.spring.service;

import com.spring.aspect.LoggingAspect;
import com.spring.model.Circle;

public class ShapeServiceProxy extends ShapeService{
	public Circle getCircle() {
		new LoggingAspect().loggingadvice();
		return super.getCircle();
		
	}

}
