package com.syntax.repl;

public class Repl68Pattern {

	public static void main(String[] args) {
		//$$$$
		//$  $
		//$  $
		//$$$$
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if((i==2 || i==3)&&(j==2 || j==3)) {
					System.out.print(" ");
				}else {
				System.out.print("$");
				}
			}
			System.out.println();
		}
		
	    for(int i=4; i>0; i--){
	        for(int j=4; j>0; j--){
	          if((i==2 || i==3)  && (j==2 || j==3)){
	            System.out.print(" ");
	          }else{
	            System.out.print("$");
	          }
	          
	        }
	        System.out.println();
	    }

}
}
