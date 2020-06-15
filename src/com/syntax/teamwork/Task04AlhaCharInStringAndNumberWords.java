package com.syntax.teamwork;

import java.util.Scanner;

public class Task04AlhaCharInStringAndNumberWords {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?
		// Find number of words in string?

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentences with special charachters");
		String str = sc.nextLine();
		
		String str1 = str.replaceAll("[A-Za-z0-9]", "").replace(" ","");
		int aCh = str1.length();
		System.out.println(str1);
		System.out.println("Number of special characters: " +aCh);
		
		String[] words = str.split(" ");
		int wordss = words.length; 
		for(String word:words) {
			System.out.println(word);
		}
		System.out.println("Number of words in sentance: " +words.length);
		System.out.println(wordss);
		
		sc.close();
		
		//Second
		String alpha=str.replaceAll("[^A-za-z]", "");
	    int a=alpha.length();
	    System.out.println("The number of alpha characters is "+a);
	    System.out.println("________________________________");
	    String word=str.replaceAll("[A-za-z0-9!?.,]", "");
	    int b=word.length();
	    System.out.println("The number of words is "+(b+1));
	}
}
