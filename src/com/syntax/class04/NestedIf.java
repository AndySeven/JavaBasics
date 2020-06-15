package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean isFriday = true;
		int date = 13;
		
		if(isFriday) {
			System.out.println("Today is Friday, im gonna watch a movies");
			
			if(date==13) {
				System.out.println("I'll watch scary movie");
				
			}else {
				System.out.println("i'll watch a comedy");
			}
					
		}else {
			System.out.println("Today is not Friday, im staying at home");
		}
	}
}
