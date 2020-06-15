package com.syntax.class10;

public class InHomeTask02 {

	public static void main(String[] args) {
		// Create a 2D array that first row 
		// will contain 4 names and second row 
		// will contain grades. Then you program 
		// should print name of the students that 
		// has A and B grade
		
		String[][] grades = {{"Bob","Henry","Mike","John"},
		                     {"A","B","C","D"}};
		for(String[] x:grades) {
			for(String y:x){
				if(y.equals("B")) {
					System.out.println("Bob");
				}else if(y.equals("A")) {
					System.out.println("Henry");
				}
			}
			
			}
		}
		
		
	}


