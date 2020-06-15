package com.syntax.repl;

import java.util.Scanner;

public class Repl94 {
//If browser is ChRoME it should print the: 
//	"Proceed with Chrome browser"
//	If browser is FireFOX it should print the: 
//	"Proceed with Firefox browser"
//	If browser is IE it should print the:
//	"Proceed with IE browser"
//	If any other browser it should print the:  
//	"Invalid browser"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    String message=null;
	    switch(browser.toLowerCase()){
	    case "chrome":
	      browser = browser.toLowerCase().substring(0,1).toUpperCase()+
	      browser.toLowerCase().substring(1);	
	      message = "Proceed with "+browser+" browser";
	      break;
	    case "firefox":
	      browser = browser.toLowerCase().substring(0,1).toUpperCase()+
	      browser.toLowerCase().substring(1);	
	      message = "Proceed with "+browser+" browser";
	      break;
	    case "ie":
	      message = "Proceed with "+browser.toUpperCase()+" browser";
	      break;
	    default:
	      message = "Invalid browser";
	      break;
	    }
System.out.println(message);
sc.close();
	}

}
