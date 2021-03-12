package com.class04;

public class NestedIf {
	
	public static void main(String [] args) {
		
		boolean morning=true;
		
		boolean classToday=true;
		
		//is it morning? --> Good morning
		//		if there is class: yes --> hello classmates
		//			otherwise --> hello family
		
		if (morning) {
			
			System.out.println("Let me check if I have class today");
			
			if (classToday) {
				
				System.out.println("Good morning classmates");
			}else {
				
				System.out.println("Good morning family");
			}
		}
		
		System.out.println("---- End of the code ----");
		
		
		System.out.println("---------- example 2 ----------");
		
		boolean anyAllergy=true;
		
		boolean pollenAllergy=true;
		
		if(anyAllergy) {
			
			System.out.println("Let's check which allergies you have ");
			
			if (pollenAllergy) {
				System.out.println("Do not get close to the trees");
			}else {
				System.out.println("Ok. You don't have a pollen allergy");
			}
			
		}else {
			
			System.out.println("You are lucky you don't have allergies");
		}
		
		System.out.println("---------- example 3 ----------");
		
		//if it's Friday --> Go to the movies, otherwise stay at home and study
		// if it's Friday the I will check if the date is the 13th --> if yes --> watch a horror
		// if not watch any movie you would like
		
		
		boolean isFriday=false;
		int day=13;
		
		if(isFriday) {
			System.out.println("It's movie day!!");
			
			if (day==13) {
				System.out.println("I will watch a horror movie");
			}else {
				System.out.println("I will watch any available movie");
			}
			
		}else {
			System.out.println("I will stay at home");
		}
		
		System.out.println("---------- example 4 ----------");
		
		//Check assignment and based on the score we display a message
		
		boolean completed=true;
		int score=90;

		if (completed) {
			
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but let's try to do better");
			}else {
				System.out.println("Good for trying, but study more!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assignments on time");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
