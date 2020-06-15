package com.syntax.repl;

class Main {
	  String breed, name, color;
	  void bark(String name){
	    System.out.println(name+" can bark");
	  }
	  void run(String name){
	    System.out.println(name+" can run");
	  }
	  void play(String name){
	    System.out.println(name+" can play");
	  }
	  
	  public static void main(String[] args){
	    Main d1 = new Main();
	    Main d2 = new Main();
	    Main d3 = new Main();
	  
	  d1.name = "Husky";
	  d2.name = "Bulldog";
	  d3.name = "Labrador";
	  
	  d1.bark(d1.name);
	  d1.run(d1.name);
	  d1.play(d1.name);
	  
	  d2.bark(d2.name);
	  d2.run(d2.name);
	  d2.play(d2.name);
	  
	  d3.bark(d3.name);
	  d3.run(d3.name);
	  d3.play(d3.name);
	}
	}