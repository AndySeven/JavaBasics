package com.syntax.class17;

public class StaticKeyword {
	
	//create template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	// return type, name, parameters;
	// ALL static members can be accessed by Non-Static methods
static void displayGeneralInfo() {
	System.out.println("We are building "+brand+" with touch screen= "+touchScreen);
}
void displaySpecifications() {
	System.out.println("We a building phone with "+memory+"gb memory in "+color);
}
// static void displaySpecifications() {
// System.out.println("We a building phone with "+memory+"gb memory in "+color);
// }

public static void main(String[] args) {
	//accessing static variables in a static way
	brand = "iPhone";  //same class courses this way of using static variables
	touchScreen = true;
	//accessing instatnce var through the instance of the class
	StaticKeyword obj = new StaticKeyword();
	obj.color = "grey";
	obj.memory = 64;
	
	//accessing static method in a static way
	displayGeneralInfo();       //in same class just use the name of static method
								// without class
	obj.displaySpecifications();
	
}
			

}
