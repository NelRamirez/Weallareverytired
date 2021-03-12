package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 way to create a variable
		short b=200; //create a variable and assign value
					// declare a variable and initialized
		
		//2 way
		int sum; //declaration happens ONLY once
		sum=20; //initialized the variable
		sum=30; // reassign the value

		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		int x,y,z;
		
		x=10;
		y=20;
		//z=30.9; Error: Type mismatch, since variable z can only store int types of values
		
		//I would like to change to the value
		x=70;
		
		System.out.println(x);
		
		//we are using value of different variable to initialize the
		int num=33;
		int num2=num;
		
		System.out.println(num2); //it would print out 33 
		
		
	}

}
