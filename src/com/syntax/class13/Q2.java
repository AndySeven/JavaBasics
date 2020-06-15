package com.syntax.class13;

public class Q2 {

	public static void main(String[] args) {
		
		int given = 11;
		boolean isPrime = true;
		
		if(given>1) {
			for(int i=2; i<given; i++) {
				if(given%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println("Number " +given+ " is Prime? " +isPrime);
		

	}

}
