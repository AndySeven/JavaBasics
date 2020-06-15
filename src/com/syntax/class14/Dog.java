package com.syntax.class14;

public class Dog {
	String breed, color, name;
	int age;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Labrador";
		dog1.color = "white";
		dog1.name = "Charlie";
		dog1.age  = 2;
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		
		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog2.color = "black";
		dog2.name = "Romeo";
		dog2.age  = 4;
		
		dog2.eat();
		dog2.bark();
		dog2.run();
	}
		void eat() {
			System.out.println(breed+ " can eat");
		}
		void bark() {
			System.out.println(breed+ " can accelerate");
		}
		void run() {
			System.out.println(breed+ " Car can make noise");
		}
		
	}
	

