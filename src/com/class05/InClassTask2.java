package com.class05;

import java.util.Scanner;

public class InClassTask2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double quiz, mid, fScore, avg;
		char grade;
		System.out.println("Please enter your quiz results");
		quiz=scan.nextDouble();
		
		System.out.println("Please enter your mid term results");
		mid=scan.nextDouble();
		
		System.out.println("Please enter your final score results");
		fScore=scan.nextDouble();
		
		avg=(quiz+mid+fScore)/3;
		
		if (avg>= 90) {
			grade = 'A';
		}else if (avg>=70 && avg<90) {
			grade = 'B';
		}else if (avg>50 && avg<70) {
			grade= 'C';
		}else {
			grade= 'F';
		}
		
		System.out.println("Your grade is "+grade);
		
		if (grade=='A' || grade=='B') {
			System.out.println("I am happy!!");
		}

	}

}
