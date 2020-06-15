package com.syntax.class19;
// Write program as a Book class that will have 2 Constructors.
// While creating an object make sure:
// Instance variables are being initialized
// Both Constructors are being executed

class Book{
	int c;
	Book(int a){
		this(2, 3);
		System.out.println("If shape is square");
		c = a*a;
		System.out.println(c);
		
	}
	Book(int a, int b){
		System.out.println("If shape is rectangle");
		c = a*b;
		System.out.println(c);
		
	}
	
	void getSqOfShape() {
		System.out.println(c);
	}
}

public class Task2Constructors {
	public static void main(String[] args) {
Book b = new Book(2);
System.out.println("==================================");
b.getSqOfShape();
	}
}
