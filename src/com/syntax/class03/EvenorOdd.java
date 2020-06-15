package com.syntax.class03;

public class EvenorOdd {

	public static void main(String[] args) {
		
		int i = 4;
		int j = i %= 2;
		if (j == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
