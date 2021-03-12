package com.class11;

public class Hw7 {

	public static void main(String[] args) {
		//Write a program to print the first 10 numbers of Fibonacci series
		//Example: 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13, 8+13=21
		//you take the last two numbers and add them together
		//Used in Agile> User Stories (Requirements we get from clients)
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		System.out.println();
		
		System.out.println("----- Another Way -----");
		
		int f1=0;
		int f2=1;
		
		for(int f=1;f<=10;f++) {
			
			System.out.print(f1+" ");
			f1=f1+f2;
			f2=f1-f2;
			
			
			
			
		}
		
		
		

	}

}
