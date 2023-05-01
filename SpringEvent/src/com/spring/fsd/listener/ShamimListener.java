package com.spring.fsd.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.Kgf;

@Component
public class ShamimListener {
	
	public void watchKGF(String chapno) {
		System.out.println("Shamim started watching KGF");
		System.out.println("Shamim Playing KGF"+ chapno);
	}

	
	  @EventListener 
	  public void listenmovie(Kgf event) {
	  watchKGF(event.getChapterno());
	  
	  }
	 

}
