package com.spring.fsd.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import com.spring.fsd.event.Kgf;
import com.spring.fsd.event.RRR;
import com.spring.fsd.listener.DaniListener;
import com.spring.fsd.listener.RajuLIstener;

@Component
public class AmazonPrime {

	
	  @Autowired 
	  ApplicationEventPublisher applicationEventPublisher;
	

	public void streamKGF(String chapter) {
		  System.out.println("Amazon prime streaming KGF :"+chapter);
		
		  
		  applicationEventPublisher.publishEvent(new Kgf(chapter));
		 
	}

}
