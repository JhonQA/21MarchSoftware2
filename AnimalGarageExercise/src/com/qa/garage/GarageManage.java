package com.qa.garage;

import java.util.ArrayList;




public class GarageManage {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private ArrayList<Car> car = new ArrayList<Car>();

	
	
	public void addVehicles(Vehicle v) {
		this.vehicles.add(v);
	}
	
	public void billCars(Vehicle v) {
		int bill =0;
		
		
		for(Vehicle v1: vehicles) {
			if(v1.getTopSpeed() > 150) {
				 bill = 1000;
				System.out.println(v1 + " | Your bill is: " + bill   );
			}else {
				 bill = 300;
				System.out.println(v1 +" | Your bill is:" + bill);
			}			
		}
		
	}
	
	public void billQuad(Vehicle v) {
		int bill =0;
		
		
		for(Vehicle v1: vehicles) {
			if(v1.getColour().equals("Blue")) {
				 bill = 2000;
				System.out.println(v1 + " | Your bill is: " + bill   );
			}else {
				 bill = 800;
				System.out.println(v1 +" | Your bill is:" + bill);
			}			
		}
		
	}
	

}

	
	

