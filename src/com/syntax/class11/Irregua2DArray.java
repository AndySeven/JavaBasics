package com.syntax.class11;

public class Irregua2DArray {

	public static void main(String[] args) {
		
		String[][] groceries = {
				{"snikers","potato","kiwi"},
				{"eggs","banana","apple","cucumber"},
				{"fish","pastry","cheese"}
				};
			
		for(int i=0; i<groceries.length; i++) {
			for(int j=0; j<groceries[i].length; j++) {
				System.out.print(groceries[i][j]+" ");
			}
			System.out.println();
		}
		
	for(String[] array:groceries) {
		for(String items: array) {
			System.out.print(items+" ");
		}
		System.out.println();
	}
	}
	}


