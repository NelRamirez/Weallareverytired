package com.class03;

public class Casting {
	
	public static void main(String [] args) {
	
	//int i=10.99; type mismatch int can't store decimals
		
		//widening/implicit casting ex.
		double d=10;
		System.out.println(d);//10.0 it converts the int 10 into a decimal num (double)
	
		//widening/implicit (automatically)
			//byte -> short -> int -> long -> float -> double
		
		//narrowing/explicit(manually)
			//double -> float -> long -> int -> short -> byte
		
		
		//narrowing/explicit casting ex.
		int i=(int)12.99;
		System.out.println(i);//12 it converts the decimal (double) into an int (whole number)
		
		byte b=(byte)130;
		System.out.println(b);
		
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);//2
		
		int number=12;
		double result=number/5;
		System.out.println(result);//2.0
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);
		
		
		//int num1=10+10.5; type mismatch. this doesn't work because your putting a decimal (double) inside the int
		
		double num1=10+10.5;
		System.out.println(num1);//20.5
		
		
		
		
	}

}
