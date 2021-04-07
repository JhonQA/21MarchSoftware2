package com.qa.garage;

public class Car extends Vehicle {

	
	private boolean isItElectric;
	private boolean isItFourWheelDrive;
	private String makeOfCar;
	
	
	
	

	public Car(String colour, boolean hasWindows, boolean hasMirrors, int numberOfWheels, int topSpeed,
			boolean isItElectric, boolean isItFourWheelDrive, String makeOfCar) {
		super(colour, hasWindows, hasMirrors, numberOfWheels, topSpeed);
		this.isItElectric = isItElectric;
		this.isItFourWheelDrive = isItFourWheelDrive;
		this.makeOfCar = makeOfCar;
	}





	@Override
	public String toString() {
		return  super.toString() + " | Electric? " + isItElectric + " | Four wheel drive? " + isItFourWheelDrive + " | Make of car? "
				+ makeOfCar;
	}





	public void cars() {
		System.out.println("I'm used for everyday life");
	}





	public boolean isItFourWheelDrive() {
		// TODO Auto-generated method stub
		return this.isItFourWheelDrive;
	}





	public boolean isItElectric() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
