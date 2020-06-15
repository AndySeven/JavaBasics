package com.syntax.class16;

public class Doggy {
	//instance variables
		String name;
		int age;
	//static variables
		static int paws = 4;
		static int tail = 1;
		static String breed = "Huskey";
		void displayDog() {
			System.out.println(name+" "+age);
		}
	
	public static void main(String[] args) {
		
		Doggy dog1 = new Doggy();
		dog1.name = "Luci";
		dog1.age = 2;
		dog1.displayDog();
		
		System.out.println(Doggy.paws); //belong to the class accessed by class name
		System.out.println(Doggy.tail); //access
		//System.out.println(dog1.paws);  //should be accessed in static way
		System.out.println(paws);
		paws = 5;
		System.out.println(paws);
		
		//changing value of the static variable
		
		Doggy dog2 = new Doggy();
		dog2.name = "Chucky";
		dog2.age = 3;
		dog2.displayDog();	
	}

}
