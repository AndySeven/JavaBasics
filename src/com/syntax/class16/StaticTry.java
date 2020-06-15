package com.syntax.class16;
	//Create a Class called Employee:
	// three  variables eID , salary and set the CEO to “Sumair” 
	// Create two objects of the class Employee 
	// Set the value of eID, salary for each of the objects
	// Print out the eID , salary and  CEO for each of the objects 
class Employee{
	int eID, salary;
	static String CEO = "Sumair";
	
	void getInfo() {
		System.out.println("Object one CEO: "+CEO+", eID: "+eID+", has salary: "+salary);
	}
	
}

public class StaticTry {
	public static void main (String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eID = 12345;
		e1.salary = 10000;
		e1.getInfo();
	
		e2.eID = 67890;
		e2.salary = 15000;
		e2.getInfo();
		
	}
}