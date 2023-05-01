package com.spring.fsd.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.TranscationFailedEvent;

@Component
public class Gpay {
       @Autowired
       ApplicationEventPublisher applicationEventPublisher;
	
	public void sendmoney(String name,double amount,boolean condition) {
		try {
			if(condition) {
			  throw new RuntimeException("Transfer failed");
			}else {
			System.out.println("Hi"+name);
			System.out.println("Sending amount"+amount+"is sucessfully send");
			
			}
		}catch(Exception e) {
			applicationEventPublisher.publishEvent(new TranscationFailedEvent(name,amount));
			e.printStackTrace();
		}
		
		
	}
}
