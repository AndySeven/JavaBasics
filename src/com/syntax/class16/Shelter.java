package com.syntax.class16;

public class Shelter {

	public static void main(String[] args) {
		// access instance variables
		
		Doggy puppy = new Doggy();
		puppy.name = "Charly";
		System.out.println(puppy.name);
		
		//access static variables of different class
		System.out.println(Doggy.breed); //access static variable from class Doggy
	}

}
