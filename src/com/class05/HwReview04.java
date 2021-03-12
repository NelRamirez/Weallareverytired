package com.class05;

import java.util.Scanner;

public class HwReview04 {

	public static void main(String [] args) {
		
		/*Create a java program that will ask if user has a credit card or not
		 * If user does not have then offer them one
		 * If they do have one then ask the balance
		 * If balance is larger than 1000, tell them to pay it off
		 * otherwise then can continue to spend more
		 */
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		creditCard=scan.next();
		
		// .equals("yes): case sensitive
		//.equalsIgnoreCase("yes"): not case sensitive
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card?");
			
			balance=scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("Pay off immediately");
			}else {
				System.out.println("Spend more");
			}
			
		}else {
			System.out.println("Would you like a credit card?");
		}
		
	}
}
