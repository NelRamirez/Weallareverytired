package com.class15;

public class ConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Nelson";
		String lastName=" Ramirez";
		System.out.println(firstName+lastName);//Used widely in the industry
		
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		fullName=firstName.concat(lastName);//Not commonly used
		System.out.println(fullName);
		
		String var1="Hello ";
		int var2=14;
		System.out.println(var1+var2);
		// System.out.println(var1.concat(var2)); Compiler error we can only use .concat with Strings
		
		

	}

}
