package com.qa.results;

public class BlackJack {
	
	public static int blackJack(int x, int y) {
		
		int sum = x+y;
		
		if(sum>21) {
			System.out.println(0);
		}else if(sum ==21) {
			System.out.println("Blackjack!!");
		}else {
			System.out.println(sum);
		}
		
		return sum;
		}
}
