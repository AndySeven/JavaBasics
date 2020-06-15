package com.syntax.class17_1;
import com.syntax.class17.Employee;

public class AccessingMembersFromDiffPkg {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.title="QA Engineer";
		
		emp.name="Billy";
//		emp.lastName="Cox";     // protected lastName is not available in other pkg
//		emp.salary=4555;		// default salary is not available in other pkg	
//		emp.ssn="123123123123";	// private all the more so
	
		Employee.method1();     // the same shit
//		emp.method2();
//		emp.method3();
//		emp.method4();
	}
}
