package com.class05;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		
		Scanner scan;
		int height;
		scan=new Scanner(System.in);
		
		
		
		System.out.println("Please enter your height in inches");
		height=scan.nextInt();
		
		if (height>1 && height<60) {
			System.out.println("Short");
		}else if (height>=60 && height<=72) {
			System.out.println("Medium");
		}else if (height>72) {
			System.out.println("Tall");
		}
		
		
		System.out.println("---- Task 2 ----");
		
		System.out.println("What day is it?");
		
		int day=scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		

	}

}
