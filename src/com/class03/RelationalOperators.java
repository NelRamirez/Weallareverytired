package com.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 7;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);//not equal
		
		System.out.println("-------------------");//just using this to separate things. don't mind it.
		
		boolean result=a>=b;//yes --> true
		boolean result1=a<=b;//no --> false
		
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println("-------------------");
		
		int c=20;
		int d=29;
		
		System.out.println(c==d);//checking equality. it prints false
		System.out.println(c=d);//assigning the value. it prints 29
		System.out.println(c);
		System.out.println(d);
		
	}

}
