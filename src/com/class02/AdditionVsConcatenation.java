package com.class02;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);//21HelloHi
		System.out.println(num1+str1+num2+str2);//10Hello11Hi
		System.out.println(str1+str2+num1+num2);//HelloHi1011. It adds str1 and str2 = HelloHi, then adds num1, HelloHi10 making it one big string. Then adds num2 = HelloHi1011 
		
		String result=str1+str2+(num1+num2);//HelloHi21. Everything in the parenthesis comes first. So it add num1 + num2 first.
		System.out.println(result);
	}

}
