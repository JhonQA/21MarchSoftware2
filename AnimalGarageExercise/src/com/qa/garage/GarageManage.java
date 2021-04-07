package com.qa.garage;

import java.util.ArrayList;
import java.util.List;




public class GarageManage {
	
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	

	public boolean addVehicles(Vehicle v) {
		return this.vehicles.add(v);
	}
	
	public boolean removeVehicles(Vehicle v) {
		return this.vehicles.remove(v);
	}
	
	public void emptyGarage() {
		this.vehicles.clear();
	}
	
	public void showGarage() {
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
	}
	
	public float calcBill(){
		
		float bill =0f;
		
		
		for(Vehicle v: vehicles) {
			bill += v.calculateBill();
		}
		
		return bill;
		
	}
	
	public void removeVehiclesByType(Class<?> clazzy) {
		List<Vehicle> toRemove = new ArrayList<>();
		
		for(Vehicle v: vehicles) {
			if(v.getClass() == clazzy) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}
}

	
	

