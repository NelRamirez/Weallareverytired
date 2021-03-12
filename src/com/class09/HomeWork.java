package com.class09;

public class HomeWork {

	public static void main(String[] args) {
		
		//Homework 1
		//Print the following pattern:
			//55555
			//44444
			//33333
			//22222
			//11111
		
		System.out.println("---- HW 1 ----");
		
		for(int r=5; r>=1; r--) {
			
			for(int c=1; c<=5; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---- HW 2 ----");
		//Homework 2
		//Print the following pattern:
			//7654321
			//7654321
			//7654321
			//7654321
			//7654321
		
		
		for (int r=1; r<=5; r++) {
			
			for (int c=7; c>=1; c--) {
				System.out.print(c);
			}
			System.out.println();
		} 

		
		

	}

}
