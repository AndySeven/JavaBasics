package com.syntax.class07;

public class InHomeTask03 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		System.out.println("First way");
		for(int i = 20; i>=1; i-=2) {
			System.out.print(" " +i);
		}
		System.out.println("\nSecond way");
		int i = 20;
		while (i>=1) {
			if (i%2==0) {
			System.out.print(" " +i);
			}i--;
		}
		System.out.println("\nThird way");
		i = 20;
		do {
			System.out.print(" " +i);
			i-=2;
		}while (i>=1);
	}

}
