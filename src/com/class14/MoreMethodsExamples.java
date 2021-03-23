package com.class14;

public class MoreMethodsExamples {
	/* Create a method that does not take values
	 * and always return String Hi
	 */
	
	String print() {
		return "Hi";
	}
	
	/*
	 *  Create a method that takes a number
	 *  and returns the double of that number
	 */
	
	double doubleTheValue (double input) {
		return input*2;
	}
	
	/*
	 * Create a method that takes a boolean as an input
	 * If the value is true I want to say take the umbrella
	 * and if the value is false print please go for a walk
	 */
	
	void isRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}//We are using void in this case because we are not returning anything
	 //We are just simply printing a statement
	
	/*
	 * Write a method to print batch 9 is great 5 times
	 */
	
	void print5Times() {
		for(int i=0; i<5; i++) {
			System.out.println("Batch 9 is great");
		}
	}
	
	
	/*
	 * Create a method that takes 2 numbers as input
	 * Return the greater number
	 */
	
	int greater(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	
	/*
	 * Create a method that takes a number
	 * If number is even print even
	 * otherwise print odd
	 */
	
	
	void evenOrOdd(int num1) {
		if(num1%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	/*
	 * Write a method that takes an array
	 * and returns the sum of the elements that are present in the array
	 */
	
	double returnTheArray(double [] arr) {
		
		double sum=0;
		for(double element:arr) {
			sum=sum+element;
		}
		
		return sum;
		}
	
	
	/*
	 * write a method that returns true if a string is a mirror of itself
	 * 
	 * aba yes
	 * bbb yes
	 * bba no
	 */
	
	boolean isMirror(String str) {
		String newStr="";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}
	
	}
	

}
