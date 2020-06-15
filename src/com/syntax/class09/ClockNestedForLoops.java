package com.syntax.class09;

public class ClockNestedForLoops {
	public static void main(String[] args) {
	// 10 until 99 using nested loop
	/*
	 * 10
	 * 11
	 * 12
	 * ..
	 * ..
	 * 99
	 */
		
//	for(int i=1; i<=9; i++) {
//		for(int j=0; j<=9; j++) {
//			System.out.println(i+""+j);
//			
//		}
//	}
//    
//	System.out.println("-------------clock using nested for--------------");
//
//	
//	
//	for(int x=0; x<=11; x++) {
//		for(int y=0; y<=59; y++) {
//			if (y<10 && y<10) {
//				System.out.println("0"+x+":0"+y);
//			} else if(x>9 && y<10) {
//				System.out.println(x+":0"+y);
//			} else if(x<10 && y>9) {
//				System.out.println("0"+x+":"+y);
//			}
//			
//			else {
//				System.out.println(x+":"+y);
//			}
//			
//		}
//	}
//	
//	System.out.println("-----------cloc using 4 for loop nested min and sec----------------");
//	
//	for(int a=0; a<=5; a++) {
//		for(int b=0; b<=9; b++) {
//			for(int c=0; c<=5; c++) {
//				for(int d=0; d<=9; d++) {
//					System.out.println(a+""+b+":"+c+""+d);
//				}
//			}
//		}
//	}
	
//System.out.println("-----------clock using 4 for loop nested hours and min----------------");
//	
//	for(int a=0; a<=2; a++) {
//		for(int b=0; b<=9; b++) {
//			if (a==2 && b>3) {
//				continue;
//			}
//			for(int c=0; c<=5; c++) {
//				for(int d=0; d<=9; d++) {
//					System.out.println(a+""+b+":"+c+""+d);
//				}
//			}
//		}
//	}
//	
System.out.println("-----------clock using 4 for loop nested hours and min and seconds----------------");	
	
	for(int a=0; a<2; a++) {
		for(int b=0; b<10; b++) {
			if(a==1 && b>1) {
				continue;
			}
			for(int c=0; c<6; c++) {
				for(int d=0; d<10; d++) {
					for(int e=0; e<6; e++) {
						for(int f=0; f<10; f++) {
							System.out.println(a+""+b+":"+c+""+d+":"+e+""+f);
						}
					}
				}
			}
		}
	}

}
}