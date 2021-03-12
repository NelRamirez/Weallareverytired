package com.class08;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		
		//Print numbers from 1 - 50 except those that are divisible by 3
		
		for(int i = 1; i<=50; i++) {
			
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		//Task 2
		//Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		
		do {
			System.out.println("Would you like to apply for a credit card?");
			answer=scan.nextLine();
		}while (!answer.equalsIgnoreCase("yes")); {
		System.out.println("Lets get you started");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		
		
		
		
		
		
		
		
		//Task 3
		//Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
		
		int start;
		int end;
		
		System.out.println("Please enter starting point");
		start=scan.nextInt();
		
		System.out.println("Please enter ending point");
		end=scan.nextInt();
		
		int sumOdd = 0;
		int sumEven = 0;
		
				
		for(int i=start; i<=end; i++) {
			
			if (i%2!=0) {
				sumOdd+=i;
			}else {
				sumEven+=i;
			}
		}
		
		System.out.println("Summ of Odd numbers from range "+start+" to "+end+" is = "+sumOdd);
	
		System.out.println("Summ of Even numbers from range "+start+" to "+end+" is = "+sumEven);

		
		
		
		

	}

}
