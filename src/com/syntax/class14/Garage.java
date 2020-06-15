package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Lambarghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "m5";
		car2.year = 2019;
		car2.color = "Pink";
		
		Car car3 = new Car();
		car3.make = "123";
		car3.speed = 200;
		
		
		//print Lamba
		System.out.println(car1.make);
		//accesss to behavior
		car1.drive();
		car1.accelerate();
		car1.makenoise();
		car1.stop();
		
		//I drive pink bmw
		System.out.println("I drive "+car2.color+" "+car2.make);
		car2.drive();
		car2.accelerate();
		car2.makenoise();
		car2.stop();
		//create bike object
		// new bike() --> cannot create an object if we don have  a class
		//car2.breaking(); CE-method is not defined

		Car2 anotherCar = new Car2();
		anotherCar.make = "Toyota";
		anotherCar.speed = 90;
		anotherCar.drive();
		
		
	}
}
