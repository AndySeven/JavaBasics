package com.syntax.class34;
// Create a method checkUserName that will throw
// a runtime exception.
// Method should throw an exception when entered
// username is less than 5 characters.
public class Task2 {
	
	public static void main(String[] args) {
		checkUserName("Barbara");
		checkUserName("Ass");
		
		System.out.println();

	}
	
	public static void checkUserName(String name) {
		try {
		if(name.length()<5) {
			throw new RuntimeException("To short username");
		}else {
			System.out.println("Welcome: "+name);
		}
		}catch(RuntimeException re) {
			System.out.println("Exception: "+re.getMessage()+" :cought");
		}
	}

}
