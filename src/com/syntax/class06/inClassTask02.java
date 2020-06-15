package com.syntax.class06;

import java.util.Scanner;

public class inClassTask02 {
	public static void main(String[] args) {
		
		/*  Allow user to enter grade and then provide 
		 *  explanation: A-Excellent, B-Good, C-Average, 
		 *  D-Bad, any other grade --> Not Acceptable. 
		 *  At the end your program should print which 
		 *  grade was entered by a user with explanation.
		 */
		
		char grade;
		String expl;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		grade = sc.next().charAt(0);
		sc.close();
		
		switch(grade) {
		case 'A':
			expl = "Excelent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
			expl = "Not Acceptable";
			break;
		}
		System.out.println("Your Grade " +grade+ " is " +expl);
	}
}
