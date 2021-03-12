package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//keywords - a special word hat reserved in java memory:class, public, static, final, for
		
		//Identifiers - name that we give to classes, variable and methods
		
		/*
		 * Rule!!!
		 * Do not use keywords as identifiers
		 * Identifiers cannot contain space
		 * Identifiers cannot start with a number
		 * Identifiers cannot have special characters: _ or $ are the only ones allowed
		 */
		
		//int final=10; Error: INVALID IDENTIFIER. you would get an error because it is a keyword

		//byte variable one=12; Error: because there is a space in between the 
		
		//3. short 1b=12;
		short b1=12;
		
		//4 long *l=20000;
		//long l*=20000;
		
		long _l=20000;
		long long_=29990;
		
		double $price=12.99;
		double price$=10.99;
		
		//NamingConvention
		//1. we use camel casing
		//2. classes start with upper case and will follow with Camel casing
		//3. variables start with lower case and will follow camel casing
		//4. packages we use lower case and use name as reverse way of url
		//5. use meaningful name for your variables
		
		int Number=12; // try not to use uppercase names
		int number=12; // preferable
		
		int numberOne=12;
		int numberTwo=13;
		
		boolean itsSnowing=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.89;

		
	}

}
