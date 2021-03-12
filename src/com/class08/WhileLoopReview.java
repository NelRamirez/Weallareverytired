package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		
		
		/* We need to make user pay for a soda
		 * keep asking user to pay until it enters 3
		 * 
		 * if user gives more than (>) 3 --> please give less money
		 * if user gives less than (<) 3 --> please give more money
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int num;
		
		System.out.println("Please pay for soda");
		num=scan.nextInt();
		
		
		
		while(num!=3); {
			
			if (num<3) {
				System.out.println("Please give more money");
			} else if (num > 3) {
				System.out.println("Please give less money");
			}
			
			num=scan.nextInt();

		}
		System.out.println("Thank you");
		
		
	}

}
