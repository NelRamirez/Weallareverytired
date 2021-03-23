package com.class14;

public class HomeWork {
//Methods
	
	/*
	 * Create a method that will say Hello in different languages
	 * based on the country that will be passed when method is executed
	 */
	
	void language(String str) {
		if(str.equalsIgnoreCase("Usa")) {
			System.out.println("Hello");
		}else if (str.equalsIgnoreCase("El Salvador")) {
			System.out.println("Hola");
		}else if (str.equalsIgnoreCase("Japan")) {
			System.out.println("Konichiwa");
		}else if (str.equalsIgnoreCase("Italy")) {
			System.out.println("Ciao");
		}else {
			System.out.println("Sorry, I don't know");
		}
		}
	
	/*
	 * Write a method to return whether a given number is prime or not
	 */
	
	boolean isPrime(int num1) {
		
		boolean prime=true;
		if(num1>1) {
			for(int i=2; i<num1;i++) {
				if(num1%i==0) {
					prime=false;
					break;
					
				}
			}
		}else {
			prime=false;
		}
		if(prime) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	/*
	 * Create class Student that will have a method getGrade.
	 * Your method should accept the score of a student and return a grade
	 */
	
	String getGrade(int num1) {
		if(num1>=90) {
			return "A";
		}else if(num1>=80) {
			return "B";
		}else if(num1>=70) {
			return "C";
		}else if(num1>=50) {
			return "D";
		}else {
			return "F";
		}
	}
	
	
	
	
}
