package com.class18;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account=new Account();
		Scanner scanner=new Scanner(System.in);
		
		//account.accountBalance=154525;
		
		while(true) {
			System.out.println("Enter \n 1 for sign up \n 2 for login \n 3 for transfer \n 4 to exit the program");
			int input=scanner.nextInt();
			
			if(input==4) {
				break;
			}else if(input==3) {
				System.out.println("Enter the amount you want to transfer");
				double amount=scanner.nextDouble();
				System.out.println("Please enter your password");
				String pass=scanner.next();
				account.transferFunds(pass, amount);
				
			}else if(input==2) {
				System.out.println("Welcome to our bank please enter your Username and Password");
				String userName=scanner.next();
				String password=scanner.next();
				account.login(userName, password);
				
			}else if(input==1) {
				System.out.println("Enter your Username, Password and the amount that you want to deposit");
				account.signUp(scanner.next(), scanner.next(), scanner.nextDouble());
			}
		}
		
		System.out.println("Good bye");

	}

}
