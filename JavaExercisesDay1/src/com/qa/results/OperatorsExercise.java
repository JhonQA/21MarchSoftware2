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

		return totalMark;

	}
}
