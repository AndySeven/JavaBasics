package com.syntax.class15;
class Test{
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
	    Test t = new Test();
	    System.out.println(t.spaceOut("hello"));
	    
	    System.out.println(t.spaceIut("hello"));
		System.out.println(t.spaceIut("technology"));
	  }
	}