package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		//I want to capture 5 different names and say hello to everyone
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int q=5;
		
		while (q>=1) {
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("Hello "+name);
			q--;
			
		}
		
		
		

	

	}

}
