package com.qa.garage;

public class Motorcycle extends Vehicle{

	
	private boolean helmetInvolved;
	private String model;
	
	

	public Motorcycle(String colour, boolean hasWindows, boolean hasMirrors, int numberOfWheels, int topSpeed,
			boolean helmetInvolved, String model) {
		super(colour, hasWindows, hasMirrors, numberOfWheels, topSpeed);
		this.helmetInvolved = helmetInvolved;
		this.model = model;
	}

	


	@Override
	public String toString() {
		return super.toString() +" | Helmet involved? " + helmetInvolved + " | Model? " + model ;
	}




	public void motorBike() {
		System.out.println("I'm used for everyday life too, but more exciting ;)");
	}

}
