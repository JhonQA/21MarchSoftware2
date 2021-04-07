package com.qa.results;

public class FlowChartRecreation {

	public static boolean recreation(boolean x) {
		
		
		// this is the same as the iterations exercise
		//just completed with while statements

		boolean flowChar = x;
		int count = 100;

		while (x) {
			System.out.println("A");

			if (count > 200) {

				flowChar = false;
				break;
			}
			count++;

		}

		System.out.println("End");
		return flowChar;
	}

	public static int recreationTwo(int x) {

		
		int num=x;
				while(num%2==0) {
					System.out.println("-");
					num++;
					System.out.println("*");
					
					if(num<=200) {
						num++;
					}else {
						System.out.println("finished");
						break;
					}
				}
		return num;
	}
	
	
	public static void IterationNum() {
		
		
	
 		
		for(int i =1; i<11 ;i++ ) {
			for(int j =1; j<11 ;j++ ) {
				System.out.println(i);
			}
			
		}
		
		// does the reverse of what it should do, can't figure out answer
//		for(int i =1; i<11 ;i++ ) {
//			for(int j =i; j<11 ;j++ ) {
//				System.out.println(i);
//				}
//			}
//			
//		}
		
		
		
		
	}
}







































