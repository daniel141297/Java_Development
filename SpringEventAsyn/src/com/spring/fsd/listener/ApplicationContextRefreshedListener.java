package com.spring.fsd.listener;


import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {

    @EventListener
	public void ContextRefreshedevent(ContextRefreshedEvent event) {
		System.out.println("Application context is intialized");
		System.out.println(event);
		
	}
    @EventListener
   	public void ContextStartedEvenet(ContextStartedEvent event) {
   		System.out.println("Application context is Started");
   		System.out.println(event);
   		
   	}
    @EventListener
   	public void ContextStoppedEvenet(ContextStoppedEvent event) {
   		System.out.println("Application context is Stopped");
   		System.out.println(event);
   		
   	}
    @EventListener
   	public void ContextClosedEvenet(ContextClosedEvent event) {
   		System.out.println("Application context is closed");
   		System.out.println(event);
   		
   	}

}
