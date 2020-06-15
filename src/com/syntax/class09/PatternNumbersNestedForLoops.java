package com.syntax.class09;

public class PatternNumbersNestedForLoops {
public static void main(String[] args) {
	/*
	 * 
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 * 
	 */
	System.out.println("-----------nested for--------- ");
	
	for(int a=1; a<=4; a++) {
		for(int b=1; b<=5; b++) {
					System.out.print(b);
				}
		System.out.println();
			}

	/*
	 * 
	 * 11111
	 * 22222
	 * 33333
	 * 44444
	 * 
	 */
System.out.println("-----------nested for---------- ");


	for(int a=1; a<=4; a++) {
		for(int b=1; b<=5; b++) {
					System.out.print(a);
				}
		System.out.println();
			}

System.out.println("-----------nested for 5 rows of 1-9------ ");


	for(int a=1; a<=5; a++) {
		for(int b=1; b<=9; b++) {
					System.out.print(b);
				}
		System.out.println();
			}	
	
System.out.println("-----------nested for------ ");
/*
 * 54321
 * 54321
 * 54321
 */
	

	for(int a=1; a<=3; a++) {
		for(int b=5; b>=1; b--) {
					System.out.print(b);
				}
		System.out.println();
			}		
	
System.out.println("-----------nested for next------ ");
	/*
	 * 
	 * 44444
	 * 33333
	 * 22222
	 * 11111
	 * 
	 */
	for(int a=4; a>=1; a--) {
		for(int b=5; b>=1; b--) {
			System.out.print(a);
		}
			System.out.println();
	}			
	
	System.out.println("-----------nested for next PYRAMID------ ");
	/*
	 * 
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 
	 */
	for(int a=1; a<=4; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print(b);
		}
			System.out.println();
	}				
	
System.out.println("-----------nested for next PYRAMID------ ");
	/*
	 * 
	 * 4444
	 * 333
	 * 22
	 * 1
	 * 
	 */
	for(int a=4; a>=1; a--) {
		for(int b=1; b<=a; b++) {
			System.out.print(a);
		}
			System.out.println();
	}				
	

}
}
