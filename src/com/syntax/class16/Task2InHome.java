package com.syntax.class16;
// Create a Class called Students
// Create three  variables studentName , studentID  and numberOfStudents
// Create three objects of the Students Class 
// Set the value for  studentName , studentID and increment  the numberOfStudents for each object
// Print out  total number of students
class Students{
	String stuedntName;
	int studentID;
	int numberOfStudents=3;	
}
public class Task2InHome {
	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		
		s1.studentID = 1;
		s1.stuedntName = "Bob";
	
		s2.studentID = 2;
		s2.stuedntName = "Lucy";
		
		s3.studentID = 3;
		s3.stuedntName = "Henry";
	}
}
