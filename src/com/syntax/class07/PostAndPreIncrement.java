package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		
		// ++, --
		// preincrement ++y, postincrement y++
		
		int i;
		int y=10;
		i=y++; //postincrement, first use the variable then increment
		System.out.println(i);
		
		int j;
		int x=10;
		j=++x;//preincrement, first increment and then assignment
		System.out.println(j);
		
		int f = 1;
		while (f<5) {
		System.out.println(++f);
		}
		
		System.out.println("---------------------");
		
		int g = 1;
		while(g<5) {
		System.out.println(g);
		++g;
		}
	}

}
