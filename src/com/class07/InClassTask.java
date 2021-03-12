package com.class07;

public class InClassTask {

	public static void main(String[] args) {
		
		int num1=1;
		
		while (num1<=100) {
			System.out.print(num1+" ");
			num1++;
		}
		
		System.out.println();
		System.out.println("-----");
		
		
		num1=100;
		
		while (num1>=1) {
			System.out.print(num1+" ");
			num1--;
		}
		
		System.out.println();
		System.out.println("-----");
		
		//Print even numbers from 20 - 100
		
		int num2=20;
		
		while (num2<=100) {
			System.out.print(num2+" ");
			num2+=2;
		}
		
		System.out.println();
		System.out.println("-----");
		
		//Print even number from 20 - 100 using if
		
		int a=20;
		
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
				a++;
			}
			
		}
		
	}

}
