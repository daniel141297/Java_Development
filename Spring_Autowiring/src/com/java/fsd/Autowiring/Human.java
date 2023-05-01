package com.java.fsd.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanheart")
	private Heart heart;

	public void startPumping() {
		if(heart !=null) {
		heart.pump();
		
		System.out.println("Name of the animal "+heart.getNameOfAnimal()+" no of heart is"+heart.getNoOfHeart());
		}else {
			System.out.println("Your are dead");
		}
	}

}
