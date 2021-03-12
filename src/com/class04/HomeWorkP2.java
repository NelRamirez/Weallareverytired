package com.class04;

import java.util.Scanner;

public class HomeWorkP2 {
	
	public static void main(String [] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String a=scan.nextLine();
		
		
		if (a.equals("yes")) {
			System.out.println("What is the balance on the card?");
			
			int b=scan.nextInt();
			
			if (b>1000) {
				System.out.println("Pay off immediately");
			}else if (b<1000) {
				System.out.println("You may continue using your credit card");
			}
		}else {
			System.out.println("Would you be interested in a credit card?");
		}

	}

}
