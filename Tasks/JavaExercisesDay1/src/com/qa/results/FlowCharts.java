package com.qa.results;

public class FlowCharts {

	public static boolean flow(int x, int y, boolean z) {
		int sum = x + y;
		int mul = x * y;

		if (z == true) {
			System.out.println(sum);
		} else {
			System.out.println(mul);
		}

		return z;
	}

	public static int flowC(int x) {

		if (x > 2000) {
			System.out.println("A");
			if (x > 6000) {
				System.out.println("C");
			} else if (x < 6000) {
				System.out.println("B");
			} else if (x > 4000) {
				System.out.println("D");
			} else if (x < 4000) {
				System.out.println("E");
			}
		} else {

			System.out.println("1");
			if (x > 100) {
				System.out.println("3");
			} else if (x > 600) {
				System.out.println("5");
			} else if (x > 500) {
				System.out.println("6");
			} else if (x < 100) {
				System.out.println("2");
			} else if (x < 600) {
				System.out.println("4");
			} else if (x < 500) {
				System.out.println("7");
			}
		}
		return x;
	}
}
