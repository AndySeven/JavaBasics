package com.syntax.class07;

public class InHomeTask02 {

	public static void main(String[] args) {
		// Print numbers from 100 to 1
		
		System.out.println("-----For Loop-----");
		
		int i;
		char space = ' ';
		for(i=100; i>=1; i--) {
			System.out.print(i);
			System.out.print(space);
		}

		System.out.println("\n-----Do While Loop");
		
		int j = 100;
		do {
			System.out.print(j);
			System.out.print(space);
			j--;
		}while (j>=1);

		System.out.println("\n-----Do While Loop");
		
		int k = 100;
		while (k>=1) {
			System.out.print(k);
			System.out.print(space);
			k--;
		}
		System.out.println("\ni = "+i+"\nj = "+j+"\nk = "+k);
	}
}
