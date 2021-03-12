package com.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * byte - datatype --> what kind of values we are going to store
		 * box1 - name of variable --> label of the box
		 * 10 - value that we assign to that variable --> values we put inside the box
		 */
		
		//we are storing whole number values
		byte box1=10; //-128 thru 127
		
		short box2=100; //-32768 thru 32767
		
		int box3=10000; //-2147483648 thru 2147483647
		
		long box4=10000000000L; //if the number doesn't fit in long you can add an 'L' at the end of the number. lower case or upper case work.
		
		//we are storing floating numbers
		float f=12.99f; //can store up to 5 to 6 after decimal point
		double d=12.95; //can store up to 14 to 15 after decimal point
		
		//we are storing single character values
		
		char a='*';
		char b='M';
		char c='1';
		
		//to store boolean values
		
		boolean variable1=true;
		boolean variable2=false;
		
		//I would like to store value 99
		
		int number=99;
		
		System.out.println(d);
		System.out.println(a);
		
		//System.out.print(bool); Program gives error because variable bool is not created at the current moment
		//boolean bool=true; program executes from top to bottom
		
		System.out.println(variable1); //true
		System.out.println("variable1"); //variable1. It's only writing is because it's in "" marks

	}

}
