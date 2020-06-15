package com.syntax.class07;

public class InHomeTask01 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		System.out.println("-------------FOR LOOP-----------");
		for (int i=1; i<=100; i++) {
			System.out.print(" " +i);
		}
		System.out.println("\n-------------DO WHILE LOOP------");
		int j=1;
		do {System.out.print(" " + j);
			j++;
		}while (j<=100);
		System.out.println("\n-------------WHILE LOOP---------");
		int k=1;
		while (k<=100) {
			System.out.print(" " + k);
			k++;
		}	
	}
}
