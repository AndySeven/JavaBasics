package com.syntax.class17;

public class StaticKeywordTest {
	public static void main(String[] args) {
		// access members of another class
		StaticKeyword.brand = "Android";
		StaticKeyword.touchScreen = true;
		StaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		
			StaticKeyword obj = new StaticKeyword();
			obj.color = "red";
			obj.memory=128;
			obj.displaySpecifications();
			
		
			StaticKeyword obj2 = new StaticKeyword();
			obj2.color = "Balck";
			obj2.memory=256;
			obj2.displaySpecifications();
			
		
			

	}

}
