package com.qa.results;

public class FizzBuzz {
	public static int fizzBuzz(int x, int y) {
		int multiply = x *y;
		
		if(multiply%3==0 && multiply%5==0) {
			System.out.println("FizzBuzz");			
		} else if( multiply % 5==0) {
			System.out.println("Buzz");
		}else if(multiply%3==0 ) {
			System.out.println("Fizz");
		}else {
			System.out.println(multiply);
		}
		
		
		return multiply;
	}

}
