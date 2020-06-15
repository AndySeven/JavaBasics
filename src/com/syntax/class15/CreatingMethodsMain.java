package com.syntax.class15;

public class CreatingMethodsMain {

	public static void main(String[] args) {
		
		CreatingMethods cm = new CreatingMethods();
		char g = cm.getGrade(60);
		System.out.println(g);
		System.out.println(cm.getGrade(85));
		
		if(g =='A' && g =='B') {
			System.out.println("good job");
		}else {
			System.out.println("Study more");
		}
	}

}
