package com.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			
			System.out.print("* ");
		}
		
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=4; r++) {//Rows
			
			for(int c=1; c<=5; c++) {//Columns
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=6; r++) {
			
			for(int c=1; c<=8; c++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=4; r++) {
			
			for(int c=1; c<=5; c++) {
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=5; r++) {
			
			for(int c=6; c>=1; c--) {
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=5; r++) {
			
			for(int c=1; c<=5; c++) {
				
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("-----------");
		
		for (int r=1; r<=5; r++) {
			
			for(int c=0; c<r; c++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}

		
		
		
	}

}
