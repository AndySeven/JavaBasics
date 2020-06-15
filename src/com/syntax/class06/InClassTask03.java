package com.syntax.class06;
import java.util.Scanner;
public class InClassTask03 {

	public static void main(String[] args) {
//		Using scanner class create calculator.
//		Allow user to enter 2 numbers and operator(+,-,*,/).
//		Based on operator provide the result to user.
		
		double a,b;
		char operator;
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = sc.nextDouble();
		System.out.print("Enter second number: ");
		b = sc.nextDouble();
		System.out.print("Enter operator: ");
		operator = sc.next().charAt(0);
		sc.close();
		
		switch(operator) {
		case '+':
			result = a+b; break;
		case '-':
			result = a-b; break;
		case '*':
			result = a*b; break;
		case '/':
			result = a/b; break;
		default:
			System.out.println("Invalid Operator");	
		}
		
		System.out.println(a+ " " +operator+ " " +b+ " = " +result);
	}
}
