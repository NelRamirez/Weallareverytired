package com.class04;

public class InClassTask {

	public static void main(String[] args) {
		
		//Task 1
	
		boolean diploma=true;
		double gpa=3.6;
		
		if (diploma) {
			System.out.println("Congrats");
			
			if (gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else System.out.println("You should have studied harder");
		}else 
			System.out.println("Get a degree");
		
		System.out.println("-------------------------");
		
		
		//Task #2
		
		double mRate=5.3;
		int mPrice=2000000;
		
		if (mRate>4.5) {
			System.out.println("will not buy house");
		}else {
			System.out.println("Consider buying a house");
			if (mPrice>200000) {
				System.out.println("Take out a loan");
			}else
				System.out.println("Pay cash");
		}
		
		System.out.println("-------------------------");
		
		//Nested example
		
		/*
		 * To donate blood:
		 * You must be 18 and older, otherwise you can't
		 * Your weight must be over 110lbs, otherwise you can't donate
		 */
		
		int age=20;
		int weight=100;
		
		if (age>=18) {
			System.out.println("Good, now let's check your weight");
			
			if (weight>110) {
				System.out.println("You can donate");
			}else {
				System.out.println("Sorry, you can't donate");	
			}
			
			
		}else {
			System.out.println("Must be 18 or over to donate");
		}
		
		
		
		
		
		
		
		
		

	}

}
