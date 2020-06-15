package com.syntax.class14;

public class Car {
	String make, model, color;
	int year, speed;
	//define behavior
		void drive() {
			System.out.println(make+ " can drive");
		}
		void accelerate() {
			System.out.println(make+ " can accelerate");
		}
		void makenoise() {
			System.out.println(make+ " Car can make noise");
		}
		void stop() {
			System.out.println(make+ " stops when you press break");
			System.out.println(make+ " Stops");
		}
}

