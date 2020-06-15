package com.syntax.class15;

public class Methods {
// create the method that will saa welcome 10 times
	
	void sayWelcome(){
		for(int i=0; i<10; i++) {
			System.out.println("Hello");
		}
	}
	//any word any number of times
	
	void sayAnyWord(String word, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	//method that will accept boolean value
	// as a parameter
	// and based on the value print message accordingly
	
	void isItRaining(boolean rain) {
		if(rain) {
			System.out.println("Take an umbrela");
		}else {
			System.out.println("Good weather outside");
		}
	}
}
