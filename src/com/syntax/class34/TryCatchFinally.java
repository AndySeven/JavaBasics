package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
	public static void main(String[] args) {

		division(10, 5);
		division(10, 0);
		read("");
		System.out.println("---------End Of Code---------");
		
	}

	public static void division(int num, int num1) {
		try {
			System.out.println(num / num1);
		} catch (ArithmeticException ae) {
			// ae.printStackTrace(); // detailed message of an exception
			// System.out.println(ae.getMessage()); // message of an exception
			System.out.println(ae); // name and message
		} finally {
			System.out.println("Finally block code is always executed");
		}
	}

	public static void read(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			Properties prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException ioe) {
			System.out.println(ioe);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
	}
}
