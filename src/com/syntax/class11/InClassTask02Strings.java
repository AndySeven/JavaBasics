package com.syntax.class11;

import java.util.Scanner;

public class InClassTask02Strings {

	public static void main(String[] args) {
		
		//  Accept username, password and confirm 
		//  password from a user and check following requirements:
		
		//	-Username and Password cannot be empty,if so→ message=“Username and Password cannot be empty”.
		//	-Password should be minimum 8 characters, if less → message=“Password is too short”.
		//	-Password cannot contain username if so, → message=“Password cannot contain username”.
		//	-Password should match confirmed password, if not  → message=“Passwords do not match”.
		//	Only after all requirements met → message “Your username and password has been created”
		
		Scanner sc = new Scanner(System.in);
		String username;
		String pasword;
		String confirm;
		System.out.println("Enter your username");
		username = sc.nextLine();
		System.out.println("Enter your pasword");
		pasword = sc.nextLine();
		
		
		
		//empty or not
		if (!(pasword.isEmpty() || username.isEmpty())) {
			
			if (pasword.length()>=8) {
			
				if (!pasword.toLowerCase().contains("username")) {
					
					System.out.println("Confirm password");
					confirm = sc.nextLine();
					
					if (pasword.equals(confirm)) {
						
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("!!!!Passwords do not match");
					}
				}else {
					System.out.println("!!!!Password cannot contain username");
				}
			}else {
				System.out.println("!!!!Pasword is too short");
			}
		}else {
			System.out.println("Username and Password cannot be empty");
		}
			
		sc.close();
		
	}

}
