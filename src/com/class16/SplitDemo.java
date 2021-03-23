package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
		
		// This is a widely used method
		
		String var1="Today is Wednesday";
		//System.out.println(var1.length());
		
		String[] strArr=var1.split(" ");
		for(String word:strArr) {
			System.out.println(word);
		}
		
		String var2="Syntax is best. batch 9 is great.";
		String[] strArr2=var2.split("[.]");//splitting the sentences .
		
		for(int i=0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		
		//Method chaining
		String var3="     SYNTAX     ";
		System.out.println(var3.trim().toLowerCase());
		
		System.out.println();

	}

}
