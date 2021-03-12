package com.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		//HW3
		
		Scanner scan=new Scanner(System.in);
		
		int num1, num2, total;
		
		String operator;
		
		System.out.println("Please enter your first number");
		num1=scan.nextInt();
		
		System.out.println("Please enter your operator");
		operator=scan.next();
		
		System.out.println("Please enter your second number");
		num2=scan.nextInt();
		
		switch (operator) {
		
		case "+":
			total=num1+num2;
			break;
		case "-":
			total=num1-num2;
			break;
		case "*":
			total=num1*num2;
			break;
		case "/":
			total=num1/num2;
			break;
		default:
			total=0;
			System.out.println("Error");
			break;
		}
		
		if (total!=0) { 
		
		System.out.println(num1+" "+operator+" "+num2+" = "+ total);
		}

	}

}
