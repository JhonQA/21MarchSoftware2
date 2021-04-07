package com.qa.results;

public class StringManipulation {

	public static void strManipulation() {
		
		String newStr = "today it is sunny,";
		String anotherStr=		"yesterday it was rainy";
		
		System.out.println(newStr.toUpperCase());
		
		
		System.out.println(newStr.length());
		System.out.println(newStr.substring(0,11).concat(anotherStr.substring(34)).toUpperCase());
	}
}
