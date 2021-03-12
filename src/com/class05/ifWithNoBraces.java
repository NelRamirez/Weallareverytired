package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		// We use braces {} to identify what belongs to the if
		// if without braces: Java thinks only the first statement under the if belongs to it.
		
		String day="Friday";
		
		System.out.println("----- if without braces ----");
		
		if (day.equals("Friday"))
			System.out.println("Today is my movie day");
		System.out.println("Tomorrow I have class at Syntax");
		
	
		
		System.out.println("----- if with braces ----");//Always use braces
		
		if (day.equals("Friday")) {
			System.out.println("Today is movie day");
			System.out.println("Tomorrow I have class at Syntax");
		}
		
		System.out.println("---- End of program ----");
		
		int num=10;
		
		if(num>=10)
			System.out.println("Number is larger than 10");
		else // if no braces java identifies only 1 statement per block (if block or else)
			System.out.println("Number is less than 10");
			System.out.println("Second statement inside else block");
		
		
	}

}
