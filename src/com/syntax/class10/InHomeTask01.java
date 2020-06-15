package com.syntax.class10;

public class InHomeTask01 {

	public static void main(String[] args) {
		// Create a 2D array where you will store
		// the following values: Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] people = new String[2][4];
		people[0][0] = "Mr";
		people[0][1] = "Mrs";
		people[0][2] = "Ms";
		people[0][3] = "Miss";
		people[1][0] = "Smith";
		people[1][1] = "Jordan";
		people[1][2] = "Jackson";
		people[1][3] = "Obama";
		
		System.out.println(people[0][0]+" "+people[1][0]);
		System.out.println(people[0][1]+" "+people[1][1]);
		System.out.println(people[0][2]+" "+people[1][2]);
		System.out.println(people[0][3]+" "+people[1][3]);	
	}
}
