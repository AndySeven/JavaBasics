package com.syntax.teamwork.fridaysession;

public class Prime {

	public static void main(String[] args) {
		int i;
		int n = 100;
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		for (i = 0; i < n; i++) {
			if (isPrime2(arr[i]))
				System.out.print(arr[i] + " | ");
		}
	}
	
	public static boolean isPrime(int a) {
		int flag = 0;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				flag++;
			}
		}
		if (flag > 0 || a == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean isPrime2(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
}
	
	
}
