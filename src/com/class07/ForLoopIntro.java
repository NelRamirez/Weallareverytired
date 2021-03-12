package com.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//for (Initialization; condition; increment/decrement)
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("---- Print numbers from 1-50 ----");
		
		for (int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("---- Print numbers from 10-1 ----");
		
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("---- What is my output? ----");
		
		for(int a=0; a<=10; a+=2) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("---- What is my output? ----");
		
		for(int i=5; i<=50; i+=10) {
			System.out.print(i+" ");//5 15 25 35 45
		}

		
		
	}

}
