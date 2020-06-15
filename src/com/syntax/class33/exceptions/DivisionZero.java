package com.syntax.class33.exceptions;

import java.util.Random;

public class DivisionZero {

	public static void main(String[] args) {
		Random r = new Random();
		int a=0, b=0, c=0;
		
		for(int i=0; i<45678; i++) {
			try {
			b = r.nextInt();
			c = r.nextInt();
			a = 12345/(b/c);
		}catch (ArithmeticException e){
			System.out.println("Division on zero Exception: "+e); //displaying with error message 
			a = 0;
		}
		}
		System.out.println(a);

		
	}

}
