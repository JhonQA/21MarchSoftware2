package com.qa.results;

public class LoopsExample {

	public static void whileLoop(String a) {
		
		while(a== "Cust") {
			System.out.println("Customer CRUD");
			a ="Exit;";
		}
}
	
	public static void forloop (int inp) {
		for(int count=0; count<=inp;count++) {
			int times =inp *count;
			System.out.println(inp +  " * " + count + " = " + times);
		}
	}
}
