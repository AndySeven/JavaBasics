package com.syntax.class17;

class DefaultMethod{
///*  Create a method that will accept an array 
// *  as parameters and will return a sum of all 
// *  elements from that array. Method should be
// *  visibly only within same package and accessible 
// *  by the creating an instance of the class. (default)
	
	int getSumArray(int[] array) {
		int sum=0;
		for(int x: array) {
			sum+=x;
		}
		return sum;
	}
}
class InClassTask {	

	public static void main(String[] args) {
		
		DefaultMethod obj = new DefaultMethod(); 
		int[]arr = {3,4,2,6};
		int i = obj.getSumArray(arr);   //default access from another class within same pkg
		System.out.println("sum of the array "+i);
	}

}
