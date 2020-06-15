package com.syntax.class16;

class Dog{
	String name;
	int age;
void displayDog() {
	System.out.println(name+" "+age);
}
}
class InstanceVariables {
String name = "John"; // instance variable

}	

public class InstanceVariablesMain {
	
public static void main(String[] args) {
		String name = "Bob";  //local variable
		System.out.println(name);
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		
		obj.name = "Ali";
		System.out.println(name);
		System.out.println(obj.name);
		
		name = "Ford";
		System.out.println(name);
		Dog dog1 = new Dog();
		dog1.name = "Luci";
		dog1.age = 2;
		dog1.displayDog();
		Dog dog2 = new Dog();
		dog2.name = "Chucky";
		dog2.age = 3;
		dog2.displayDog();	
	}
}
	


