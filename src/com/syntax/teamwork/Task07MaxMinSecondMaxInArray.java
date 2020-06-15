package com.syntax.teamwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task07MaxMinSecondMaxInArray {

	public static void main(String[] args) {
		// Write a java program to find the second 
		// largest number in the array? 
		// Maximum and minimum number in the array?

//		int[] array = {2,4,69,9,55,23,77,-3,4};
//		
//		int min=0,max=0,secm=0;
//		
//		for(int a:array) {
//			if(max<a) {
//				max=a;
//			}
//			if(min>a) {
//				min=a;
//			}
//		for(int b:array) {
//			if(b<max && secm<b) {
//				secm=b;
//		}
//	}			
//}
//		System.out.println(max);
//		System.out.println(min);
//		System.out.println(secm);
		
		
		
		
		
		
		Scanner inp=new Scanner(System.in);
		int max1,min1,max2,s;
		System.out.println("Eneter the array size");
		s=inp.nextInt();
		int[] arr=new int[s];	
		for (int i=0; i<arr.length; i++) {
			System.out.println("Please enter "+(i+1)+" elemet of the array");
			arr[i]=inp.nextInt();
		}
		min1=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (min1>arr[i]) {
				min1=arr[i];
			}
		}
		max1=min1;
		max2=min1;
		for (int i=0; i<arr.length; i++) {
			if (max1<arr[i]) {
				max2=max1;
				max1=arr[i];
				}
			else if (max2<arr[i]){
				max2=arr[i];
			}
			
		}
		System.out.println("Max:"+max1);
		System.out.println("Min:"+min1);
		System.out.println("2nd max:"+max2);
		
		// One more way 
		
		Arrays.sort(arr);
		System.out.println("smallest " +arr[0]);
		System.out.println("largest " +arr[arr.length-1]);
		System.out.println("sec largest " +arr[arr.length-2]);
		
		inp.close();
		
		

	}
}
