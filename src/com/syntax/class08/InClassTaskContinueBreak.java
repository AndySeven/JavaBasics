package com.syntax.class08;

public class InClassTaskContinueBreak {

	public static void main(String[] args) {
		// 1-20, except 5,6,7

		for (int i =1; i<21; i++) {
			
			if (i==5 || i==6 || i==7) {
				System.out.println("skipping 567");
				continue;
			}
		System.out.println(i);
		}
		
		
	}

}
