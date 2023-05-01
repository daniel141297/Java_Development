package com.spring.fsd.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.TranscationFailedEvent;

@Component
public class SendEmailListener {

	@EventListener
	public void start(TranscationFailedEvent event) {
		System.out.println("SEnding Email to user");
		System.out.println("HI"+event.getName()+"Your Tranfer is failed amlount is:"+event.getAmount());
	}
}
