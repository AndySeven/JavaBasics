package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		String st1 = "Hello";
		String st2 = "Bye";
		
		String sto = st1+st2;
		st1 = sto.replace(st1,"");
		st2 = sto.replace(st2,"");
		
		System.out.println(st1);
		System.out.println(st2);

	}

}
