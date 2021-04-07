package com.qa.results;

public class IterationsExercises {

	public static void flow() {

		// task1
		for (int a = 100; a < 202; a++) {
			
			if(a>200) {
				System.out.println("End");
			}else {
				System.out.println("A");
			}
		}
	}
	// task2

	public static void flowTwo() {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	
}
