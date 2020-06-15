package com.syntax.class15;

public class Google {
	//define
	
	int empId;
	double salary;
	String name,lastName,title;
	
	void working(){
		System.out.println(title+" is working");
	}
	void getPaid() {
		System.out.println(name+" is getting paid "+ salary);
	}
	void attendMeetings() {
		System.out.println(name+ " attending meetings");
	}
	
	public static void main(String[] args) {
		Google emp1 = new Google();
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.title="CEO";
		emp1.salary=20000;
		
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		
		Google emp2 = new Google();
		emp2.empId=124;
		emp2.name="Bob";
		emp2.lastName="Diggy";
		emp2.title="QA Engeneer";
		emp2.salary=18000;
		
		emp2.working();
		emp2.getPaid();
		emp2.attendMeetings();
		
		
		
	}

}
