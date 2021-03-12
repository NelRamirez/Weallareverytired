package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		
		/* Store gender using M or F
		 * based on the gender we will specify
		 * 		if M --> Male
		 * 		if F --> Female
		 * 		otherwise --> not sure
		 */
		
		char gender='F';
		String description;
		
		switch(gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
		}
		
		System.out.println(description);
		
		/*
		 * Limitations:
		 * switch CANNOT use relational or logical operators (it simply checks value/equality)
		 * switch ONLY work with byte, short, char, int, and String
		 * switch CANNOT work with boolean, float, double, long
		 */
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
		}
		
		//double price=10.99
				System.out.println("Too expensive");
		
		//switch(price) {
		
		}
			
		
		
		
		
	{
	}

}
