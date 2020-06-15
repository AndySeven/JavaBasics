package com.syntax.class15;

public class CreatingMethods {
	// method accept marks (90,80)
	// based on the marks it will return grades
	// A B C >90-->A, 80-90 B, 80-70 C
	
	char getGrade(int mark) {
		char grade = 0;
		if(mark>=90) {
			grade='A';
		}else if(mark>=80 && mark<90){
			grade='B';
		}else if(mark>=70 && mark<80) {
			grade='C';
		}else {
			System.out.println("invalid garde");
		}
		return grade;
	}

}
