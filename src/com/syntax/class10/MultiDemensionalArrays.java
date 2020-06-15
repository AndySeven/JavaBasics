package com.syntax.class10;

public class MultiDemensionalArrays {
	public static void main(String[] args) {
		int[][] numbers = new int[3][4];
		
		// 1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		// 2 row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		// 3 row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		
		System.out.println("-----------------");
		// print values of the array
		System.out.println(numbers[1][2]);
		// array of 4 single dimensionals array
		int[][] n = {{1,2},
					 {3,4},
					 {5,6},
					 {7,8}};
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[0].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		int[][] nico = new int[3][4];
		for(int a=0; a<nico.length; a++) {
			for(int b=0; b<nico[0].length; b++) {
				nico[a][b]=b+a;
			}
		}
			for(int c=0; c<nico.length; c++) {
				for(int d=0; d<nico[0].length; d++) {
					System.out.print(nico[c][d]+" ");
			}
				System.out.println();
		}
		
	System.out.println("----------------------------------------");
		
		String[][] month = {{"January","February","December"},
							{"March","April","May"},
							{"June","July","August"},					
							{"September","October","November"}};
		int rows = month.length;//how many arrays
		int firstArray = month[0].length;
		System.out.println("rows: "+rows);
		System.out.println("length: "+firstArray);
		
		
		for(int i=0; i<month.length; i++) {
			for(int j=0; j<month[i].length; j++){
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("========Foe Each 2D Array=======");
		for(String[] m: month) {
			System.out.println(m[0]+" "+m[1]+" "+m[2]);
		}
		System.out.println();
	}
}

