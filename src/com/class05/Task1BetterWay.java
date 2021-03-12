package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		
		Scanner scan;
		int height;
		scan=new Scanner(System.in);
		
		
		
		System.out.println("Please enter your height in inches");
		height=scan.nextInt();
		
		String def;
	
		if (height>1 && height<60) {
			def="short";
			
		}else if (height>=60 && height<=72) {
			def="medium";
			
			
		}else if (height>72) {
			def="tall";
			
		}
		System.out.println("You are a person whose height is ");
		
		
		

	}

}
