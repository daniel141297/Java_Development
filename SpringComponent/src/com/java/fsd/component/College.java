package com.java.fsd.component;



public class College {
	
	private Principal principal;
	
	
	public College(Principal principal) {
		
		this.principal = principal;
	}


   

	public void test() {
		System.out.println("Test class");
		principal.principalInfo();
	}
	
	
   
}
