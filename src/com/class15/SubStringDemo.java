package com.class15;

public class SubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="Syntax is best";
		
		System.out.println(var.substring(5));//Specify starting index
		
		System.out.println(var.substring(7,9)); //You can also specify a starting point and ending

		
		//Another example. This was taken from repl
		//Retrieve 2 Strings using substring method from given String and print them
		//classes at Syntax
		//I love Java
		
		
		String given="I love Java classes at Syntax";

	    System.out.println(given.substring(12));
	    System.out.println(given.substring(0,11));
	    
		
	}

}
