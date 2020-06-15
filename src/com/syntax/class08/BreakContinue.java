package com.syntax.class08;

public class BreakContinue {

	public static void main(String[] args) {
		// 1 -100 except 35-55
for(int i =1; i<=100; i++) {
	
	if (i>=35 && i<=55) {
		continue;
	}
System.out.print(" " +i);	
}


	}

}
