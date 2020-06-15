package com.syntax.class19;
public class Animals {
	public String fur, size, color;
	public static int age;
	public static void display() {
		System.out.println("Animals age is "+age);
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	public void eat() {
		System.out.println("All animals eat");
	}
	public void beWild() {
		System.out.println("All animals can be wild");
	}
}
class Dog extends Animals {	
	String breed;
	public void bark() {
		System.out.println("All dogs bark");
	}
}
class Puppy extends Dog {
	
}
class TestClass {
	public static void main(String[] args) {
		Dog dog=new Dog();
		//access var from own class
		dog.breed = "Husky";
		//access var from parent calss
		dog.color = "Grey";
		dog.fur = "Too much";
		dog.size = "Big";		
		//access method from own class
		dog.bark();
		//access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		Dog.age = 2;
		Dog.display();
		
		Animals animal = new Animals();
		animal.color = "Any";
		animal.fur = "Any";
		animal.size = "Any";
		animal.beWild();
		animal.eat();
		animal.sleep();
	}
}

