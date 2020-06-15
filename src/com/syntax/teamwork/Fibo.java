	package com.syntax.teamwork;

public class Fibo {

	public static void main(String[] args) {
	
		
		int sum=0, num1=0, num2=1;
		for(int i=0; i<10; i++) {
			System.out.println(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
			
		}
		
	}

}
