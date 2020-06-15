package com.syntax.teamwork.fridaysession;
/**
Print numbers Start to End,
When number is multiple of 3, print Fizz,
When number is multiple of 5, print Buzz,
When number is multiple of 3 and 5, print FizzBuzz,
Else print the number.
*/

public class StartEnd {

	public static void main(String[] args) {
	
		FizzBuzz(100);
		
		
	}
	
	public static void FizzBuzz(int a) {
		
		for(int i=1; i<=a; i++) {
		if(i%15==0)
			System.out.print("FizzBuzz"+" ");
		else if(i%5==0)
			System.out.print("Buzz"+" ");
		else if(i%3==0)
			System.out.print("Fizz"+" ");
		else
			System.out.println(i+" ");
		}
		
	}
	
	
}
