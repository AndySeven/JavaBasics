package com.syntax.class10;

public class InClassTask02SumElementsOfArray {

	public static void main(String[] args) {
		// Largest element of array
	
		System.out.println("-----------------for loop----------------");	
	int[] nums = {200,30,-1,900,56,6};
	int n=nums[0];
	for(int i=0; i<nums.length; i++) {
		if(n<nums[i]) {
		n=nums[i];
			}
		}
		System.out.println("largest is "+n);
		
	System.out.println("-----------------for each----------------");	
	
	int max=0;
	for(int num:nums) {
		if(num>max) {
			max=num;
		}	
	}
	System.out.println("largest is " +max);
	
	System.out.println("-----------------forloop----------------");	
	for (int i=0;i<nums.length; i++) {
		if(nums[i]>nums[0]) {
			nums[0]=nums[i];
			System.out.println(nums[0]);
		}
	}
	
}
}


