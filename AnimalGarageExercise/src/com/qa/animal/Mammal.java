package com.qa.animal;

public class Mammal extends Animal{
	
	private boolean hasFur;
	private int numberOfLegs;
	private int speed;
	private boolean warmBlood = true;
	
	
	public Mammal(String colour,  boolean doesItHunt, boolean isDomesticated, boolean hasFur, int numberOfLegs, int speed, boolean warmBlood) {
		super();
		this.hasFur = hasFur;
		this.numberOfLegs = numberOfLegs;
		this.speed = speed;
		this.warmBlood= warmBlood;
	}

	public void warm() {
		System.out.println("We have warm blood");
	}

}
