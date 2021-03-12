package com.class11;

import java.util.Scanner;

public class PrimeNumbersHW {

	public static void main(String[] args) {
		/* A number which is divisible by only two numbers: 1 and itself.
		 * If any number is divisible by any other number, it is not a prime number
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		int num=3;
		boolean isPrime=true;
		
		System.out.println("Please enter a number");
		num=scan.nextInt();
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime");
		}
			

	}

}
