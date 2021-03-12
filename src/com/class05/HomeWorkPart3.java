package com.class05;

import java.util.Scanner;

public class HomeWorkPart3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Please enter first number");
		a=scan.nextDouble();
		
		System.out.println("Please enter second number");
		b=scan.nextDouble();
		
		System.out.println("Please enter third number");
		c=scan.nextDouble();
		
		if (a>b) {
			if (a>c) {
				System.out.println(a + " is the largest nuumber");
			}
		}else if (b>a) {
				if (b>c) {
					System.out.println(b + " is the largest nuumber");
				}
		}else {
			System.out.println(c + " is the largest nuumber");
		}
	
	}

}
