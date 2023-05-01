package com.spring.fsd.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.Kgf;

@Component
public class RajuLIstener {
	
	public void watchKGF(String chapno) {
		System.out.println("Raju started watching KGF");
		System.out.println("Raju Playing KGF"+ chapno);
	}

	
	  @EventListener
	  public void movie(Kgf event) { 
		  watchKGF(event.getChapterno());
	  
	  }
	 

}
