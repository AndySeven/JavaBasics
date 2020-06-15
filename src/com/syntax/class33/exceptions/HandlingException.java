package com.syntax.class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String fPath = "";
		try {
			FileInputStream fis = new FileInputStream(fPath);
		} catch (FileNotFoundException fne) {
			System.out.println("FileNotFoundException catched");
		}	
		int a=10;
		int b=0;	
		try {
			System.out.println(a/b);    //  -> new ArithmeticException();
			System.out.println("BOB");
		}catch(Exception ae) {          // Throwable or Exception parent classes
			System.out.println("ArithmeticException catched");
		}
		System.out.println("End of program");
	}
}
