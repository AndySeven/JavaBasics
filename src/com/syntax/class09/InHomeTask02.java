package com.syntax.class09;

public class InHomeTask02 {

	public static void main(String[] args) {
		// Create an array of names and store all
		// names of your group. Then print your 
		// name from that array. (use 2 different 
		// ways of creating an array).
		
		String[] group;
		group = new String[7];
		group[0]="Andrii";
		group[1]="Andrei";
		group[2]="Eliza";
		group[3]="Valeriy";
		group[4]="Margarita";
		group[5]="Pavel";
		group[6]="Anton";
		
		String[] group2 = new String[7];
		group2[0]="Andrii";
		group2[1]="Andrei";
		group2[2]="Eliza";
		group2[3]="Valeriy";
		group2[4]="Margarita";
		group2[5]="Pavel";
		group2[6]="Anton";
		
		String[] group3 = {"Andrii","Andrei","Eliza","Valeriy","Margarita","Pavel","Anton"};
		
		System.out.println(group[1]+" "+group2[1]+" "+group3[1]);
}
}
