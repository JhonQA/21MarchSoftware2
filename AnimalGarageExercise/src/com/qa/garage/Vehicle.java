package com.qa.garage;

public class Vehicle {

	private String colour;
	private boolean hasWindows;
	private boolean hasMirrors;
	private int numberOfWheels;
	private int topSpeed;
	
	
	
	
	public Vehicle(String colour, boolean hasWindows, boolean hasMirrors, int numberOfWheels, int topSpeed) {
		super();
		this.colour = colour;
		this.hasWindows = hasWindows;
		this.hasMirrors = hasMirrors;
		this.numberOfWheels = numberOfWheels;
		this.topSpeed = topSpeed;
	}


	public void noise() {
		System.out.println("Vroom");
	}
	
	@Override
	public String toString() {
		return "Vehicle colour? " + this.colour  + ". |Windows? "+ this.hasMirrors + " | Number of wheels? " + this.numberOfWheels + " | Top Speed?: " + this.topSpeed;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean isHasWindows() {
		return hasWindows;
	}


	public void setHasWindows(boolean hasWindows) {
		this.hasWindows = hasWindows;
	}


	public boolean isHasMirrors() {
		return hasMirrors;
	}


	public void setHasMirrors(boolean hasMirrors) {
		this.hasMirrors = hasMirrors;
	}


	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	
}
