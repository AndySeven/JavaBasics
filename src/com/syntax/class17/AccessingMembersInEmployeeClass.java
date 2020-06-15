package com.syntax.class17;

public class AccessingMembersInEmployeeClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.name="Bob";
		emp.lastName="Bobrov";
		emp.salary=1000;
//		emp.ssn=123123123;    variable ssn has private access modifier. Error
		
		Employee.method1();
		emp.method2();
		emp.method3();
//		emp.method4();        method4() is not visible. Error
		
	}
}
