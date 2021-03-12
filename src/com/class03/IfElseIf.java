package com.class03;

public class IfElseIf {
	//to autocomplete: ctrl+space+enter
	public static void main(String[] args) {

		// compare 2 numbers --> 3 possible conditions
		double num1 = 100.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);

		} else if (num1 < num2) {
			System.out.println("Double value " + num2 + " is larger than " + num1);

		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("-----------------");

		// based on the day number, define the day
		int day = 0;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednsesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("This date is invalid");
		}
		// to formart code: cmd + shift + f --> Mac users
		
		
		
		int month=13;
		
		if (month == 1) {
			System.out.println("January");
		}else if (month==2) {
			System.out.println("Feb");
		}else if (month==3) {
			System.out.println("March");
		} else if (month==4) {
			System.out.println("April");
		} else if (month==5) {
			System.out.println("May");
		}else if (month==6) {
			System.out.println("June");
		}else if (month==7) {
			System.out.println("July");
		}else if (month==8) {
			System.out.println("August");
		}else if (month==9) {
			System.out.println("September");
		}else if (month==10) {
			System.out.println("October");
		}else if (month==11) {
			System.out.println("November");
		}else if (month==12) {
			System.out.println("December");
		}else
			System.out.println("Not a month");
		
	}
	}
