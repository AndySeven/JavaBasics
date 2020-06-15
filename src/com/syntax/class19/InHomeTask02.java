package com.syntax.class19;
// Write program to inherit class A that has method printF 
// which is static and call or reuse that method into class B
class AA {
	static void printF() {
		int f = 7;
		System.out.println(f);
	}
}
class BB extends AA {
	
	static void printF() {
		System.out.println("F");
	}
}

class CC extends BB {
	
}


public class InHomeTask02 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BB bb = new BB();
		@SuppressWarnings("unused")
		CC cc = new CC();
		
		AA.printF();
		BB.printF();
		CC.printF();
		

		
	}
}
