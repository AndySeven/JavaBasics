package com.syntax.class11;

public class More2DArray {

	public static void main(String[] args) {
		
		String[][] professions = {
				{"QA Tester", "Developer", "PO", "Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}
				};
		
		
		for(String[] array: professions) {
			for(String pr: array) {
				System.out.print(pr+" ");
			}
		System.out.println();
		}
	}

}
