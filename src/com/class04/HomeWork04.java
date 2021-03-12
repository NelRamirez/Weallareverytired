package com.class04;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		//Task #1
		
		System.out.println("What amount are looking to have loaned?");
		
		int a=inp.nextInt();
		
		if (a<=200000) {
			System.out.println("You are eligible for a loan");
		}else {
			System.out.println("Sorry, you are uneligible for a loan");
		}
		
		System.out.println("-------------------------");
		
		//Task #2
		
		System.out.println("How old are you?");
		int age=inp.nextInt();
		
		if (age>=18) {
			System.out.println("Issue a drivers license");
		}else {
			System.out.println("You are eligible for a learners permit");
		}
	}

}
