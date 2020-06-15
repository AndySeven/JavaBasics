package com.syntax.class07;

public class PrePosDecrementIncrement {

	public static void main(String[] args) {
		int i,j;
		int a = 5;
		int b = 5;
		// the same result
		a++;
		++b;
		// 
		i = a++;
		j = ++b;
		
		
		System.out.println(a+ " " +b);
		
		System.out.println(i+ " " +j);
	}

}
