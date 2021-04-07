package com.qa.results;

public class UniqueSum {
		
		public static int uniqueSum (int x, int y, int z) {
			int sum = x+y+z;
			int fail = 0;
			if(x == y || y==z || x==z) {
				System.out.println(fail);
				return fail;
			}else {
				System.out.println(sum);
				return sum;
			}
			
		}
}
