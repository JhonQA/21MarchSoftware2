package com.qa.animal;

public class Dog extends Mammal{
	
	

	
	public Dog(String colour, boolean doesItHunt, boolean isDomesticated, boolean hasFur, int numberOfLegs, int speed,
			boolean warmBlood) {
		super(colour, doesItHunt, isDomesticated, hasFur, numberOfLegs, speed, warmBlood);
		// TODO Auto-generated constructor stub
	}

	public void Bark() {
		System.out.println("WOOF");
	}
	

}
