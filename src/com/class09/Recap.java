package com.class09;

public class Recap {

	public static void main(String[] args) {
		
		for (int i=1; i<4; i++) {//Outer loops controls inner loop
			for (int j=1; j<5; j++) {
				System.out.println("Good evening");
			}
			System.out.println("-------------");
		}
		
		System.out.println("------------");
		
		for (int i=5; i<7; i++) {
			System.out.println(i);
			
			for(int j=10; j<=12; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("------------");
		
		for (int i=1; i<3; i++) {
			
			
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("------ Print numbers from 0 - 99 using nested loop ------");
		
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<=9; j++) {
				
				System.out.println(i+" "+j);
			}
		}
		

	}

}
