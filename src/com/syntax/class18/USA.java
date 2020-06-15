package com.syntax.class18;

public class USA {
	// create variables to hold state capital of the state
	String state, stateCapital;
	
	// create method to desplay state and stateCapital.
	
	public void display() {
		System.out.println(state+" and it's capital is "+stateCapital);
	}
	
	// create a Constructor that will initialize instance variables
	public USA(String usaState, String usaStateCapital) {
		state = usaState;
		stateCapital=usaStateCapital;
	}
	
	public static void main(String[] args) {
		USA usa = new USA("Virginia", "Richmond");
		usa.display();
	}
}
