package com.syntax.class19;

public class USA {
	String state, stateCapital;
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}
public void displayState() {
	System.out.println(state);
}
public void displayStateCapital() {
	System.out.println(stateCapital);
}
// calling method 
public void displayInfo() {
	//this.displayState();
	displayState();  // by default compiler add this keyword to the method
	displayStateCapital(); //the same this.sisplayStateCapital();
}	
	public static void main(String[] args) {
		USA state1 = new USA ("Texas", "Austin");
		state1.displayState();
		state1.displayStateCapital();
		
		System.out.println("------------CAlling method inside the method-----------");
		state1.displayInfo();
		state1 = new USA ("Georgia", "Atlanta");
		state1.displayInfo();
	}
}
