package com.syntax.class12;
import java.util.Scanner;
public class InClassTask02Strings2 {
	public static void main(String[] args) {
		
System.out.println("------------------------------TASK 01------------------------");
System.out.println();
//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		Scanner sc = new Scanner(System.in);
		System.out.println("Create a string");
		String sentence;
		sentence = sc.nextLine();
		
		String sentenceNoSpaces = sentence.replace(" ", "");
		System.out.println(sentenceNoSpaces);

		
System.out.println("------------------------------TASK 02------------------------");
System.out.println();
//Create a String that should be combination of letters, numbers and special characters.
//Find out how many alpha characters are there in the String.
		
		System.out.println("Create a string containing letters, numbers and special characters: ");
		String crazy = sc.nextLine();
		
		crazy = crazy.replaceAll("[A-Za-z0-9]", "");
		int numAlphaChar = crazy.length();
		System.out.println(crazy);
		System.out.println("Number of alpha characters: "+numAlphaChar);
		
System.out.println("------------------------------TASK 03------------------------");
System.out.println();
//You have a String a=“Is it Saturday? Is it raining? Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?

		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
		int count=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='!' || a.charAt(i)=='?' || a.charAt(i)=='.') {
				count++;
			}
		}
		System.out.println("# of Sentances: " +count);
		
		String[] array = a.split("\\?");
		for(String arr:array) {
			System.out.println(arr);
		}
		System.out.println("# of Sentances: " +array.length);
		
		
		sc.close();
	}
}

