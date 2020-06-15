package com.syntax.class18;
// Write a java program of Class Students that takes students name and 3 subject grades. 
// Inside your class also have a method to Calculate Average Grade. 
// Test Student class for 5 different students with different marks. 
// Your program should print an average mark of each students name.
// NOTE: please use different names for instance and local variables.

class Students{
	static String subject1, subject2, subject3;
	int mark1, mark2, mark3;
	String name;	
Students(String studentName, int m1, int m2, int m3){
	mark1 = m1;
	mark2 = m2;
	mark3 = m3;
	name = studentName;
}
void getGrade() {
	double average = (mark1+mark2+mark3)/3;
	System.out.println("Average garde of student "+name+" is "+average);
}
}
public class ConstructorTask2 {
	public static void main(String[] args) {
		Students.subject1 = "Algebra";
		Students.subject2 = "Chemistry";
		Students.subject3 = "Geography";		
		Students s1 = new Students("Bobby", 9, 7, 6);
		Students s2 = new Students("Willi", 5, 8, 3);
		Students s3 = new Students("Scotti", 7, 5, 2);
		Students s4 = new Students("Alice", 9, 3, 7);
		Students s5 = new Students("Kurt", 3, 6, 8);	
		s1.getGrade();
		s2.getGrade();
		s3.getGrade();
		s4.getGrade();
		s5.getGrade();
		
	}
}
