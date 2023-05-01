package com.spring.fsd.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.TranscationFailedEvent;

@Component
public class SendSmsListener {
	
	@Async
	@EventListener
	public void start(TranscationFailedEvent event) {
		
		  try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		e.printStackTrace(); }
		 
		
		System.out.println("SEnding Sms to user");
		System.out.println("HI"+event.getName()+"Your Tranfer is failed amlount is:"+event.getAmount());
	}

}
