package com.syntax.teamwork.fridaysession;

public class Fibonacci {

	public static void main(String[] args) {

		fibonacci(11);
		System.out.println();
		System.out.println(fibonacciSingleNumber(3));
		System.out.println(fiboRecSingle(3));
		fiboRec(11);
	}

	/**
	 * fibonacci series
	 * 
	 * @param n
	 */
	public static void fibonacci(int n) {

		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	/**
	 * 
	 * @param n
	 * @return n-ordinal fibonacci number
	 */
	public static int fibonacciSingleNumber(int n) {
		int a = 0, b = 1, c;
		
		for (int i = 0; i < n; i++) {

			c = a + b; a = b; b = c;
		}
		return a;
	}

	/**
	 * Method return ordinal n fibonacci number
	 * 
	 * @param n
	 * @return n-ordinal fibonacci number
	 */
	public static int fiboRecSingle(int n) {

		if (n <= 1)
			return n;
		return fiboRecSingle(n - 1) + fiboRecSingle(n - 2);
	}

	/**
	 * Fibonacci series by recursion
	 * @param n
	 */
	public static void fiboRec(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(fiboRecSingle(i) + " ");
		}

	}

}
