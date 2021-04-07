package com.qa.results;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
	public static void arrays() {
		
		int [] test = {10,20,30,40,50,60,70,80,90,100};
		
		
		for(int i= 0; i<test.length;i++) {
			System.out.println(test[i]*10);
		}
		
//		for(int i: test) {
//			System.out.println(i*10);
//		}
	}
	
	
	public static void arrayListPractice() {
		ArrayList<String> sandwich = new ArrayList<String>();
		
		sandwich.add("Tuna Sandwich");
		sandwich.add("BLT");
		sandwich.add("CBQ chicken");
		sandwich.add("Huh");
		
//	sandwich.remove(1);
//	Collections.sort(sandwich); //sorts arraylist alphabetically
//	Collections.swap(sandwich, 0,3);
//	Collections.reverse(sandwich);
//	ArrayList sandwich2= (ArrayList) sandwich.clone();
	System.out.println(sandwich);
		

		
//		for(String i : sandwich) {
//			System.out.println(i);
//		}
	}
}
