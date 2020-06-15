
package com.syntax.class09;

public class PatternNestedForLoops {
public static void main(String[] args) {
	/*
	 * *****
	 * *****
	 * *****
	 * 
	 */
	System.out.println("---------using nested pattern----------------");
	
	for(int a=1; a<=4; a++) {
		for(int b=1; b<=5; b++) {
					System.out.print("*");
				}
	System.out.println();
	}

System.out.println("---------pattern using nested loops 2----------------");
	
	for(int a=1; a<=4; a++) {
	
	
	for(int b=1; b<=4; b++) {
		System.out.print("*"+" ");
		
	}
	System.out.println();
	}
	System.out.println("---------pattern using nested loops 9x10----------------");	
	
	for(int a=1; a<=9; a++) {
		for(int b=1; b<=10; b++) {
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println("---------pattern using nested PYRAMID ----------------");	
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 */
	
	for(int a=1; a<=4; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println("-----------nested for next PYRAMID------ ");
	/*
	 * 
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * 
	 */	
	
	for(int a=1; a<=5; a++) {
		for(int b=1; b<=a; b++) {
			
			System.out.print("*");
		}
		System.out.println();
		
	}
		for(int a=4; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("-----------nested for next PYRAMID if else------ ");
		
		for(int a=1;a<=9;a++) {
            if(a<=5) {
                for(int b=1;b<=a;b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for(int b=9;b>=a;b--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

		
		
		
}
}
