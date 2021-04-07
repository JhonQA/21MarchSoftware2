package com.qa.garage;

public class QuadBike extends Vehicle {
	
	private boolean isItElectric;
	private String size;
	private String makeOfQuad;
//	private int 


	public QuadBike(String colour, boolean hasWindows, boolean hasMirrors, int numberOfWheels, int topSpeed,
			boolean isItElectric, String size, String makeOfQuad) {
		super(colour, hasWindows, hasMirrors, numberOfWheels, topSpeed);
		this.isItElectric = isItElectric;
		this.size = size;
		this.makeOfQuad = makeOfQuad;
	}



	@Override
	public String toString() {
		return super.toString()+ " | Electric? " + isItElectric + "| size= " + size + " | Make? " + makeOfQuad;
	}



	public void quad() {
		System.out.println("I'm used for cross country :)");
	}



	@Override
	public float calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	
	
}
