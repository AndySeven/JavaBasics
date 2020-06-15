package com.syntax.class04;

public class Alergy {

	public static void main(String[] args) {
		boolean alergy = true;
		boolean appleA = true;
		boolean orangeA = true;
		boolean kiwiA = false;
		if (alergy) {
			System.out.println("Please answer below");
			if(appleA) {
				System.out.println("Dont eat apples");
			}
			if(orangeA) {
				System.out.println("Dont eat oranges");
			}
			if (kiwiA) {
				System.out.println("Dont eat kiwis");
			}
		}else {
			System.out.println("You are healthy");
		}

	}

}
