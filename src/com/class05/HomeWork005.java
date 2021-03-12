package com.class05;

import java.util.Scanner;

public class HomeWork005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		String month=a.nextLine();
		String season = null;
		
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		}else {
			System.out.println("Invalid month");
		}
		
		System.out.println("You were born in the " + season);

		
		
		
		
		
		

	}

}
