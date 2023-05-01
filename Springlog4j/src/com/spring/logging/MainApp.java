package com.spring.logging;

import org.apache.log4j.Logger;

public class MainApp {
	static Logger log= Logger.getLogger(MainApp.class.getName());
	
   public static void main(String args[]) {
	   
	   log.info("program dslkljvlks");
	   System.out.println("Hello World");
	   log.info("program en,dnvkgldfnded");
	   log.trace("Trace Message!");  
	      log.debug("Debug Message!");  
	      log.info("Info Message!");  
	      log.warn("Warn Message!");  
	      log.error("Error Message!");  
	      log.fatal("Fatal Message!");  
	   
   }
}
