package com.java.fsd.Autowiring;

public class Heart {
	private String nameOfAnimal;
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	private int noOfHeart;

	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
		
		}
}
