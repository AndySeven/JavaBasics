package com.syntax.teamwork;
public class Task05ReverseStringAndWordsInString {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?
		
		String str = "Greatest Of All Time";
		
		//reverse whole string:
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
		//reverse words:
		System.out.println();
		
		String[] f = str.split(" ");
		for(int i=0; i<f.length; i++) {
			for(int j=f[i].length()-1; j>=0; j--) {
				System.out.print(f[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		//second words mine
		System.out.println();
		System.out.println("=============");
		String[] f1 = str.split(" ");
		for(int i=f1.length-1; i>=0; i--) {
			System.out.print(f1[i]+" ");
		}
		
		
		//SECOND
		System.out.println();
		String reversed = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Reversed string = "+reversed);
		
		String[] array = str.split(" ");
		String reverseWords="";
		
		for(int i=array.length-1; i>=0;i--){
			reverseWords=reverseWords+array[i]+" ";
		}
		
		System.out.println("Reversed String word by word: " +reverseWords);
	}
}
