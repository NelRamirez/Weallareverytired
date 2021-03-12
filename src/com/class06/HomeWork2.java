package com.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		//HW 2
		
		Scanner scan=new Scanner(System.in);
		String grade, z;
		
		System.out.println("Please enter your grade");
		grade=scan.next();
		
		switch (grade.toUpperCase()) {
		
		case "A":
			z="Excellent";
			break;
		case "B":
			z="Good";
			break;
		case "C":
			z="Average";
			break;
		case "D":
			z="Bad";
			break;
		default:
			z="Not Acceptable";
			break;
		}
		System.out.println(grade+" is "+z);
		

	}

}
