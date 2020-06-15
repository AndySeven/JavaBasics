package com.syntax.class19;
// Write a Java program called Teacher. 
// Identify features and behavior of that Class. 
// Create 3 subclasses MathTeacher, ChemistryTeacher 
// and PianoTeacher that would have it their own 
// features and behavior. Test all 4 classes 

class Teacher {
	String name, position;
	char gradeOveral;
	Teacher(String name, String position, char gradeOveral) {
		this.position = position;
		this.name = name;
		this.gradeOveral = gradeOveral;
	}
	void teachInfo() {
		System.out.println("Superclass");
	}
	void yell() {
		System.out.println(name+" is yelling: I am teacher");
	}
}
class MathTeacher extends Teacher {
	char mathGrade;
	MathTeacher(String name, String position, char gradeOveral, char mathGrade){
		super(name, position, gradeOveral);
		this.mathGrade = mathGrade;
	}
	void teachInfo() {
		System.out.println(name+" is a "+position+" he has a "+gradeOveral+" overal grade and "+mathGrade+" mathematics grade");
	}
}
class ChemistryTeacher extends Teacher {
	char chemGrade;
	ChemistryTeacher(String name, String position, char gradeOveral, char chemGrade){
		super(name, position, gradeOveral);
		this.chemGrade = chemGrade;
	}
	void teachInfo() {
		System.out.println(name+" is a "+position+" he has a "+gradeOveral+" overal grade and "+chemGrade+" chemistry grade");
}
}
class PianoTeacher extends Teacher {
	char pianoGrade;
	PianoTeacher(String name, String position, char gradeOveral, char pianoGrade){
		super(name, position, gradeOveral);
		this.pianoGrade = pianoGrade;
	}
	void teachInfo() {
		System.out.println(name+" is a "+position+" he has a "+gradeOveral+" overal grade and "+pianoGrade+" piano grade");
}
}
public class InHimeTask03 {
	public static void main(String[] args) {
		
		MathTeacher m1 = new MathTeacher ("Bob", "MathTeacher", 'C', 'A');
		MathTeacher m2 = new MathTeacher ("Jremy", "MathTeacher", 'B', 'A');
		
		ChemistryTeacher c1 = new ChemistryTeacher ("Lisa", "ChemTeacher", 'B', 'B');
		ChemistryTeacher c2 = new ChemistryTeacher ("Iosif", "ChemTeacher", 'A', 'A');
		
		PianoTeacher p1 = new PianoTeacher ("Greg", "PianoTeacher", 'A', 'A');
		PianoTeacher p2 = new PianoTeacher ("Willy", "PianoTeacher", 'B', 'A');
		
		p1.yell();
		
		m1.teachInfo();
		m2.teachInfo();
		c1.teachInfo();
		c2.teachInfo();
		p1.teachInfo();
		p2.teachInfo();
		


	}
}
