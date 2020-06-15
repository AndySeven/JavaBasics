package com.syntax.class18;

public class ThisUsing {
	ThisUsing(){
		System.out.println("Bob");
	}
	
	ThisUsing(int a){
		this();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ThisUsing t = new ThisUsing(4);
		

	}
}
