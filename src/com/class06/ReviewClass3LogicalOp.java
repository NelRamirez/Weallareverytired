package com.class06;

import java.util.Scanner;

public class ReviewClass3LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Logical operators are used to combine multiple conditions in the same if block
		
		//Without Logical Operators
		String day="Sunday";
		
		if ("Sunday".equals(day)) {
			System.out.println("Relax it's the weekend");
		}else if (day.equals("Saturday")) {
			System.out.println("Relax it's the weeekend");
		}else {
			System.out.println("I have to go to work");
		}
		
		// Using Logical Operators. 
		// Same result as above but with a lot less code 
		if ("Sunday".equals(day) || day.equals("Saturday")) {
			System.out.println("Relax it's the weeekend");
		}else {
			System.out.println("I have to go to work");
		}
		
		System.out.println("------------");
		
		int number=1000;
		
		if (number>=0) {
			if (number<=100) {
				System.out.println("0 to 100");
			}
		}else {
			System.out.println("Out of range");
		}
		
		
		if (number>=0 && number<=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of range");
		}
		
		if (number>0 && number<=100) {
			System.out.println("Checking");
			System.out.println("Checking");
		}
		
		System.out.println("-------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password");
		
		String pass=scan.next();
		System.out.println("Enter the amount of money that you want to transfer");
		double transferAmount=scan.nextDouble();
		
		if (pass.equals("pass 123") && transferAmount<1000) {
			System.out.println("Amount transferred");
		}else {
			System.out.println("Either your password is not correct or you do not have enough funds");
		}
		
		
		if (pass.equals("pass123")) {
			System.out.println("Enter the amount that you want to transfer");
			transferAmount=scan.nextDouble();
			if (transferAmount<1000) {
				System.out.println("Amount transferred");
			}else {
				System.out.println("Not enough funds");
			}
		}else {
			System.out.println("Password is not correct");
		}
		
		
		
		
		

	}

}
