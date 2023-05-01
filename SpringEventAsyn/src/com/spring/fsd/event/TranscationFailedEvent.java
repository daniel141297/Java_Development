package com.spring.fsd.event;

public class TranscationFailedEvent {
	
	private String name;
	private double amount;
	
public TranscationFailedEvent(String name, double amount) {
		
		this.name = name;
		this.amount = amount;
	}
	
	
	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}
	

}
