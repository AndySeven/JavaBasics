package com.syntax.class19;

class A {
String name;
A(String name) {
	this.name = name;
}

void getInfo() {
	System.out.println(name+" "+this.name);
}
}

class B extends A {
	int num;
B(String name, int num){
	super(name);
	this.num = num;
}

void getInfo() {
	System.out.println(name+""+this.name+"   "+num);
}
}

class C extends B {
C(String name, int num){
	super(name, num);
}	
}

public class InHomeTask01 {
	public static void main (String[] args) {
		
		C c = new C("Third", 3);
		A a = new A("MainA");
		B b = new B("Second", 2);
		
		c.getInfo();
		a.getInfo();
		b.getInfo();
		
		
	}
}