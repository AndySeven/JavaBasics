package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		@SuppressWarnings("unused")
		String name = "John"; //visible only within method it was declared
	}
	
	void anotherName() {
		@SuppressWarnings("unused")
		String name = "Jane";
	}
	public static void main(String[] args) {
		//System.out.println(name); Error create a local variable name
		//name won't be visible to another method since its scope only
		// inside nameInside()
	
		LocalVariables obj = new LocalVariables();
		obj.nameInside();   // local to main()
		
		boolean flag=true;
		
		if(flag) {
			@SuppressWarnings("unused")
			String answer = "Yes"; // the scope of variable answer is if block
		}
		// System.out.println(answer); answer is not visible outside block if
		
		for(int i=0; i<=10; i++) {  
			System.out.println(i);
		}							//we can use i, becouse it is in diff blocks
									// of code(for loop)
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		
		
	}
}
