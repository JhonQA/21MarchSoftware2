package com.qa.results;

public class TaxesExercise {
	
	public static int taxPercentagePrint(int Salary) {
		
		int tax=0;
		
		if(Salary<14999) {
			System.out.println("Tax %: 0% tax");
		}else if(Salary >=15000 && Salary <=19999) {
			System.out.println("Tax %: 10% tax");
			tax=10;
		}else if(Salary >=20000 && Salary <=29999) {
			System.out.println("Tax %: 15% tax");
			tax=15;
		}
		else if(Salary >=30000 && Salary <=44999) {
			System.out.println("Tax %: 20% tax");
			tax=20;
		}else if(Salary>=45000) {
			System.out.println("Tax %: 25 tax");
			tax=25;
		}
		return tax;
		}
	
	public static int taxPercentageCalculator(int Salary) {
		
		int taxedAmount =0;
		int taxPercent = taxPercentagePrint(Salary);
		
		taxedAmount=Salary/100*taxPercent;
		
		System.out.println("Taxed Amount: " + taxedAmount);
		return taxedAmount;
			
		}	
	
	
		
	}
	


