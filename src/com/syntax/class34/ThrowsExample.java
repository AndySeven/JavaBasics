package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	// throws usually associated with checked exceptions
	public static void main(String[] args) { // no need to declare THROWS in MAIN() in multiSleep we handled the exc
		multiSleep();
		try {
			read("");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}
	}

	public static void read(String filePath) throws FileNotFoundException, ArithmeticException {
		FileInputStream fis = new FileInputStream(filePath);
	}

	public static void multiSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
}
