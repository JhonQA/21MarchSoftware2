package com.qa.animal;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dolphin dolphin = new Dolphin("Blue", false, false, false, 0, 21, true, true);
		
		dolphin.eat();
		dolphin.dolphinNoise();
		dolphin.warm();

	}

}
