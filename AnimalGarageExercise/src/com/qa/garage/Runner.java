package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorcycle bike = new Motorcycle("Green", false, true, 2, 202, true, "Ducatti");
		Motorcycle bike2 = new Motorcycle("Green", false, true, 2, 230, true, "BMW S1000RR");
		Motorcycle bike3 = new Motorcycle("Green", false, true, 2, 130, true, "Harley Davidson");
		Car car = new Car("Red", true , true, 4, 217, false , false, "Ferrari la Ferrari", 1000);
		Car car2 = new Car("Green", true , true, 4, 150, false , true, "Mercedes AMG", 15000);
		Car car3 = new Car("Black", true , true, 4, 100, true , true, "Toyota Prius", 100000);
		Car car4 = new Car("White", true , true, 4, 230, false , false, "Bugatti Veyron", 200);
		Car car5 = new Car("Gold", true , true, 4, 100, true , true, "Mitsubishi Outlander PHEV", 50000);
		
		QuadBike quad = new QuadBike("Blue", false, false, 4, 100, true, "Medium", "Yamaha");
		
		
		
		GarageManage inventory = new GarageManage();
		inventory.addVehicles(car);
		inventory.addVehicles(car2);
		inventory.addVehicles(car3);
		inventory.addVehicles(car4);
		inventory.addVehicles(car5);
//		car.cars();
		
		
		
		inventory.addVehicles(bike);
		inventory.addVehicles(bike2);
		inventory.addVehicles(bike3);
//		System.out.println("------");
//		bike.motorBike();
		
		
		inventory.addVehicles(quad);
//		System.out.println("------");
//		quad.quad();
		
		//Show every vehicle in garage
		inventory.showGarage();
		
		
		//prints out the price of all vehicles in the garage
		System.out.println("Total bill is: "+ "�" + inventory.calcBill());
		
	}

}
