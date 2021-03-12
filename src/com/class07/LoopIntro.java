package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		System.out.println("------------");
		
		int time = 10;
		
		if (time < 12) {
			System.out.println("Hello");// Code executes 1 time
		}
		
		System.out.println("---- While Loop ----");
		
		while (time < 12) {
			System.out.println("Hello");// Code runs forever
			time++;
		}
		
		System.out.println("---- Print numbers from 1 - 10 ----");
		
		int num=1;
		
		while (num<11) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		
		System.out.println("---- Print numbers from 20 - 40 ----");
		
		num=20;
		
		while (num<=40) {
			System.out.print(num+ " ");
			num++;
		}
		
		System.out.println();
		System.out.println("---- Print numbers from 20 - 40 ----");
		
		int a=10;
		
		while (a>=1) {
			System.out.print(a+" ");
			a--;
		}

		


	}

}
