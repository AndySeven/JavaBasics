package com.syntax.class19;
//Write program as a Student class that has instance variables name and address.
//Create a constructor that will initialize those variables. 
//Print name & address of given student using displayInfo method.
class Student{
	String name, adress;
	
	Student(String name, String adress){
		this.name = name;
		this.adress = adress;
	}
	void displayInfo() {
		System.out.println("Student "+name+", adres is: "+adress);
	}
}
public class Task01Constructors {
	public static void main(String[] args) {
		
		Student st1 = new Student("Richi", "New Jersey");
		Student st2 = new Student("Bobby", "New York");
		st1.displayInfo();
		st2.displayInfo();
		
	}
}
