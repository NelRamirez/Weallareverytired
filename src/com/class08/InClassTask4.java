package com.class08;

import java.util.Scanner;

public class InClassTask4 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. the user how much ore money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!
		 */
		
		Scanner scan=new Scanner(System.in);
		
		String item;
		int price;
		int money;
		int remainder;
		int sum=0;
		
		System.out.println("Please enter an item you would like to buy");
		item=scan.nextLine();
		
		System.out.println("Please enter the price of "+item);
		price=scan.nextInt();
		
		System.out.println("Please pay for "+item);
		
		do {
		money=scan.nextInt();
		sum+=money;
		
		if (sum<price) {
			
			remainder=price-sum;
			System.out.println("Your missing "+remainder);
			
		}else if (sum>price) {
			remainder=sum-price;
			System.out.println("Here is your change "+remainder);
			
			break;
			
		}else {
			System.out.println("You got the exact amount");
		}
		
		}while(price!=sum);
		
		System.out.println("Thank you for shopping");
		
		
		
		
		

	}

}
