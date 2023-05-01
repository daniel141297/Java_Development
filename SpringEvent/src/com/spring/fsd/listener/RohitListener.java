package com.spring.fsd.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.fsd.event.Kgf;

@Component
public class RohitListener {
	public void watchKGF(String chapno) {
		System.out.println("Rohit started watching KGF");
		System.out.println("Rohit Playing KGF"+ chapno);
	}

	/*
	 * @EventListener public void listenmovie(Kgf event) {
	 * 
	 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * watchKGF(event.getChapterno());
	 * 
	 * }
	 */

}
