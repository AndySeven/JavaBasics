package com.syntax.class17;

public class Employee {
	//create variables to hold: name. last name, title, ssn;
	
	public static String title;
	public String name;					            	//Accessible everywhere by everyone  
	protected String lastName;							//Accessible within same pkg + subclass other pkg
	double salary;										//Accessible within same pkg
	@SuppressWarnings("unused")
	private long ssn;									//Accessible only within same class
	
	public static void method1() {
		System.out.println("I am public method");       //Accessible everywhere by everyone
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am default method");
	}
	@SuppressWarnings("unused")
	private void method4() {
		System.out.println("I am private method");
		
		// accessing within same class
		Employee emp = new Employee();
		emp.name="John";
		emp.lastName="Cook";
		emp.salary=900;
		emp.ssn=1233423123;
		
		// access all methods
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
	}
}
