package com.syntax.class10;

public class ArraysRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades = new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println(average);
		
		System.out.println("-----------------------------------");
		
		String[] cities = {"Washington DC", "New York", "Paris", "Milan", "Los Angeles"};
		//I live in Paris
		System.out.println("I live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println(cities[x]);
		
		System.out.println("---------------amount of elements--------------------");
		//how many elements stored inside an array?
		int arraySize=cities.length;
		System.out.println("Total elements " +arraySize);
		
		System.out.println("-------------------last element---------------------");
		// how can we access last element from an array?
		System.out.println(cities[arraySize-1]);
		
		System.out.println("----------------all elements capture------------------");
		//access all elements from an array
		for(int b=0; b<arraySize; b++) {
			System.out.println(cities[b]);
		}
		
		
	}

}
