package com.syntax.class33.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
// How would handle InputMismatchException? 
// Input Mismatch Exception when user enters 
// mismatch value then programmer expected.

public class UserMissmatchException {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		int str = 0;
		
		try {
		str = s.nextInt();
		
		} catch(InputMismatchException um){
			System.out.println("Name of exception: "+um);
		}
		
		System.out.println(str);

	}

}
