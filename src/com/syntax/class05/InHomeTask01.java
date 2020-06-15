package com.syntax.class05;

import java.util.Scanner;

public class InHomeTask01 {

	public static void main(String[] args) {
//		Write a program that will read three inputs of scores 
//		(quiz, mid term, and final scores) and determine 
//		the grade based on the following rules: 
//			if the average score >=90 → grade=A
//			if the average score >= 70 and <90 → grade=B
//			if the average score>=50 and <70 → grade=C
//			if the average score<50 → grade=F
		
		double score;
		double quiz;
		double midTerm;
		double finalScore;
		char grade = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter Quiz Score");
		quiz = sc.nextDouble();
		System.out.println("Please Enter MidTerm Score");
		midTerm = sc.nextDouble();
		System.out.println("Please Enter Final Score ");
		finalScore = sc.nextDouble();
		score = (quiz + midTerm + finalScore)/3;
		
		
		if (score > 0) { 
			if (score >= 90) {
				grade = 'A';
			}else if (score >=70 && score < 90) {
				grade = 'B';
			}else if (score >= 50 && score < 70) {
				grade = 'C';
			}else {
				grade = 'F';
			}
		}else {
			System.out.println("Invalid Data");
		}
			System.out.println("Your Average score is: " + score + "\nThe grade is: " + grade);
			
			
			
			
			System.out.println("------------------------------TASK 2--------------------------");
//			Write a program for user to enter his/hers birth month. Based on the month define the season.
//			Example: if user is born in June, July or August → season =“Summer”.
//			At the end of the program we should see output as “You were born ______“.
			
			String bm;
			String season = null;
			Scanner dc = new Scanner(System.in);
			
			System.out.println("Please Enter Your Birth Month");
			bm = dc.nextLine();
			
			sc.close();
			dc.close();
			
			if (bm.equals("June") || bm.equals("July") || bm.equals("August")) {
				season = "Summer";
			}else if (bm.equals("September") || bm.equals("October") || bm.equals("November")) {
				season = "Fall";
			}else if (bm.equals("December") || bm.equals("January") || bm.equals("February")) {
				season = "Winter";
			}else if (bm.equals("March") || bm.equals("April") || bm.equals("May")) {
				season = "Spring";
			}else {
				System.out.println("Invalid Data");
			}
			System.out.println(season);	
	}
}



