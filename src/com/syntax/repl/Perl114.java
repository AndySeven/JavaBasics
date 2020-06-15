package com.syntax.repl;

public class Perl114 {
	public String spaceOut(String str){
	    return str.replaceAll(""," ").substring(1);
	  }
	  
	  public String spaceIut(String str) {
			String newString="";
			for(int i=0; i<str.length(); i++ ) {
				newString=newString+str.charAt(i)+" ";
			}
			return newString;
		}
	  
	public static void main(String[] args){
		Perl114 t = new Perl114();
	    System.out.println(t.spaceOut("hello"));
	    System.out.println(t.spaceOut("technology"));
	    
	    System.out.println(t.spaceIut("hello"));
		System.out.println(t.spaceIut("technology"));
	  }
	}