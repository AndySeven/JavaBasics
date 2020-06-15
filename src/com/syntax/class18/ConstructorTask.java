package com.syntax.class18;
// Write a program that will have a constructor: 
// one with parameters and second without any parameters. 
// Create a separate Test class where you will execute both of the constructors.

class Car{
Car(){
	
	}
}
class Animal{
	String name, size, color;
	int pow;
	Animal(String nameAnimal, String sizeAnimal, String colorAnimal, int powAnimal){
		name = nameAnimal;
		size = sizeAnimal;
		color = colorAnimal;
		pow = powAnimal;
	}
}
public class ConstructorTask {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Car carObj = new Car();
		
		@SuppressWarnings("unused")
		Animal animalObj = new Animal("Pangolin", "middle", "Grey",4);
		@SuppressWarnings("unused")
		Animal animalObj2 = new Animal("Lion", "large", "Red", 4);
		
	}
}
