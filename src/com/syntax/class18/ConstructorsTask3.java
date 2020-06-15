package com.syntax.class18;

public class ConstructorsTask3 {
	ConstructorsTask3(){
		
	}
	private ConstructorsTask3(int a){
		
	}
	protected ConstructorsTask3(int a, int b){
		
	}
	public ConstructorsTask3(String str){
		
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		ConstructorsTask3 ct = new ConstructorsTask3();
		@SuppressWarnings("unused")
		ConstructorsTask3 ct1 = new ConstructorsTask3(4);
		@SuppressWarnings("unused")
		ConstructorsTask3 ct2 = new ConstructorsTask3(4,5);
		@SuppressWarnings("unused")
		ConstructorsTask3 ct3 = new ConstructorsTask3("Bob");
		
		
	}
}
