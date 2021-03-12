package com.class07;

public class InClassTask2 {

	public static void main(String[] args) {
		
		//Task 1 - Print numbers from 1 - 100 in line with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Task 2 - Print numbers from 100 - 1
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Task 3 - Print even numbers from 20 - 1 (2 different ways)
		
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Second way of doing it
		
		for (int i=20; i>=1; i--) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		//Task 4 - Print odd numbers between 20 - 50 (2 different ways)
		
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Second way of doing it
		
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("-- What is my output --");
		
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-- What is my output --");
		
		int result = 0;
		
		for(int i=2; i<10; i+=2) {
			result+=i;
		}
		
		System.out.println(result);
		

	}

}
