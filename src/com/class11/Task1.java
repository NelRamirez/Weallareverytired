package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of double values using scanner
		// Calculate the sum of all stored elements in that array
		
		Scanner scan=new Scanner(System.in);
		
		double sum=0;
		
		System.out.println("Please enter the size of the array");
		int size = scan.nextInt();//capturing the size of the array from user
		double [] a = new double [size];//initializing the array using the size the user inputed
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter your elements");
			a[i]=scan.nextDouble();
			
			sum+=a[i];
		}
		
		System.out.println("The sum of "+size+" elements from an array ="+sum);
		
		System.out.println("---- Calculating sum using for each loop ----");
		
		sum=0;
		for(double num:a) {
			sum+=num;
		}
		
		System.out.println("The sum of "+size+" elements from an array ="+sum);
	

	}

}
