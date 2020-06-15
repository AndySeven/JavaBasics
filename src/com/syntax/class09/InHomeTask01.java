package com.syntax.class09;

public class InHomeTask01 {

	public static void main(String[] args) {
		// Create an array of chars and store grades
		// into it: A,B,C,D,E,F. Then print a grade
		// B (use 2 different ways of creating an array).
		
		char[] grades;
		grades = new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		char[] grades2 = new char[6];
		grades2[0]='A';
		grades2[1]='B';
		grades2[2]='C';
		grades2[3]='D';
		grades2[4]='E';
		grades2[5]='F';
		
		char[] grades3 = {'A','B','C','D','E','F'};
		
		
		System.out.println("Three ways: " +grades[1]+" "+grades2[1]+" "+grades3[1]);

}
}
