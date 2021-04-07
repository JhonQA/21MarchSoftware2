package com.qa.results;

public class Numbers {
	public static int numbers(int x) {
		int number = x;
		int sum =0;
	
		
		while(number >= 10  && number<= 99) {
			sum= sum +number%10;
			number= number/10;
		}
		System.out.println(sum +number);
		
		return number;
	}
	
	public static int asd (int x, int y) {
		int z = x+y;
		
		return z;
	}
	
	
	public static int numbersRevisted(int x) {
		int number = x;
		int sum=0;
		String []singles = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine",""};
		String []twos = new String[] {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen",};
		String []tens = new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty",""};
		String []hundreds = new String[] {"","","","one hundred","two hundred","three hundred","four hundred","six hundred","seven hundred","eight hundred","nine hundred",""};


		while(number >= 10  && number<= 999) {
			sum= sum +number%10;
			number= number/10;
			
			if(number==1) {
				System.out.println(twos[sum+1]);
			}else if(number==0) {
				System.out.println(tens[number]);
//			}else if(number == 10) {
//				System.out.println(hundreds[number]);
				
			}else {
				System.out.println( tens[number] + "-" +singles[sum]);
			}
		}
		
		
		
		return number;
}
}
