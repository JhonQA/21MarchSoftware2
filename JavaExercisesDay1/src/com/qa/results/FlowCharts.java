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
}
