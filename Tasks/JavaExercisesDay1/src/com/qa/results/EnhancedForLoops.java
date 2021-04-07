package com.qa.results;

public class EnhancedForLoops {

	public static void forLoops(){
		int [] test = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
		// task 1 ENHANCED FOR LOOPS
//		for(int i: test) {
//			System.out.println(i*i);
//		}
		
		
		//task 3
		for(int i:test) {
			System.out.println(i);
			forLoopsTwo(i);
		}
		
//		for(int i =0; i<test.length;i++) {
//			System.out.println(test[i]);
//		}
		
		
	}
	
	public static boolean forLoopsTwo(int x) {
		
		//task 2
		if(x%2==0) {
			System.out.println("Number is even :)");
			return true;
		}else {
		System.out.println("Number is not even- FALSE");
		return false;
		}
	}
	
	
}
