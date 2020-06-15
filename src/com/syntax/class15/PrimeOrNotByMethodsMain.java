package com.syntax.class15;
//Write a method to return whether given number is prime or not?
public class PrimeOrNotByMethodsMain {
boolean getPrimeOrNotNumber(int num) {
	boolean flag = true;
	
	for(int i=2; i<num; i++) {
		if(num%i==0) {
			flag=false;
		}
	}
	return flag;
}

	
	
	public static void main(String[] args) {
		PrimeOrNotByMethodsMain prime = new PrimeOrNotByMethodsMain();
		System.out.println(prime.getPrimeOrNotNumber(11));

	}

}
