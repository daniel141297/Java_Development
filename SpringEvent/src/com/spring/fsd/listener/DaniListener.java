package com.spring.fsd.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.Kgf;
import com.spring.fsd.event.RRR;

@Component
public class DaniListener {
	public void watchKGF(String chapno) {
		System.out.println("DANI started watching KGF");
		System.out.println("DANI Playing KGF"+ chapno);
	}

	
	  @EventListener 
	  public void listenmovie(Kgf event) {
	  watchKGF(event.getChapterno());
	  
	  }
	 
	/*worked fine
	 * @EventListener public void lisenmovie(RRR event) {
	 * watchKGF(event.getMoviename());
	 * 
	 * }
	 */
	
	

}
