package com.class16;

public class StringVsStringbuilder {

	public static void main(String[] args) {
		
		
		//Strings are immutable
		//String are immutable to save memory
		
		
		//Objects are created inside the heap
		
	
		
		
		String[] firstNames=new String[35000000];
		String[] lastNames=new String[35000000];
		String country="USA";
		
		
		String var1="USA";
		String var2="USA";
		String var3="USA";
		String var4=new String("USA");
		System.out.println(var1==var2);//Not preffered way
		System.out.println(var1==var4);
		System.out.println(var1.equals(var2));//Prefered way
		System.out.println(var1.equals(var4));
		
		StringBuilder sb=new StringBuilder("USA");
		
		
	}

}
