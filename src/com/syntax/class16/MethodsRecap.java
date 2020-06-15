package com.syntax.class16;

public class MethodsRecap {
//create a method that will accept array of integers
//and return max element
	int getLargestNum(int[] array) {
		int largest=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
		}
		return largest;
	}
//method will accept a string and return each word of it
	String[] getWordsFromString(String str) {
		String [] array = str.split(" ");
		return array;
	}
	public static void main(String[] args) {
		MethodsRecap mr = new MethodsRecap();
		int[] arr = {1,3,5,3,5,76,3,6,34};
		String myString = "Hello boys and girls!";
		System.out.println(mr.getLargestNum(arr));
		String[] words = mr.getWordsFromString(myString);
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
	}
		
}
