package com.syntax.class07;

public class InHomeTask04 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		for (int i=20; i<50; i++) {
			if (i%2!=0) {
				System.out.print(" " +i);
			}	
		}
		System.out.println("\n-----------------");
		
		
		for (int j=20; j<=50; j+=2) {
			if (j!=20)
			System.out.print(" " +(j-1));
		}
		
		System.out.println("\n-----------------");
		
		
		for (int k=20; k<=50; k+=2) {
			if (k==20) {
				continue;
			}
			System.out.print(" " +(k-1));
		}
		System.out.println("\n-----------------");		
		
		int p = 20;
		p++;
		while (p <= 50) {
			System.out.print(" " +p);
			p += 2;
    }
		
		
	}
}
