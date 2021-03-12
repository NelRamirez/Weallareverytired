package com.class04;

import java.util.Scanner;

public class HomeWorkP2T2 {
	
	public static void main(String [] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many years have you worked?");
		int years=scan.nextInt();
		
		
		if (years>=5) {
			System.out.println("You are eligible for a bonus");
			
			System.out.println("What is your annual salary");
			int sal=scan.nextInt();
			
			if (sal>50000) {
				System.out.println("5000 = bonus");
			}else if (sal<50000) {
				System.out.println("3000 = bonus");
			}
			
		}else {
			System.out.println("Sorry, you are not eligible for a bonus");
		}	
	}

}
