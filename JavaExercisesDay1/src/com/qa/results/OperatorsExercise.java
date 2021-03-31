package com.qa.results;

public class OperatorsExercise {

	public static int results(int x, int y, int z) {
		int totalMark = (x + y + z);
		float percentage = (x + y + z) * 100 / 450f;

		System.out.println("Physics Mark " + x);
		System.out.println("Chemistry Mark " + y);
		System.out.println("Biology Mark " + z);
		System.out.println("Total Mark= " + totalMark);
		System.out.println("Percentage= " + percentage + "%");
		
		if(percentage<60 ) {
			System.out.println("You have failed");
//		}else if ( x < 90|| y< 90 || z< 90){
//			System.out.println("You have failed one of your modules");
		}else if ( x < 90){
			System.out.println("You have failed Physics");
		}else if ( y< 90 ){
			System.out.println("You have failed Chemistry");
		}else if ( z< 90){
			System.out.println("You have failed Biology");
		}else {
			System.out.println("You received: " + percentage + "%" + ", Congratulations you passed");
		
		}
		
		

		return totalMark;

	}
}
