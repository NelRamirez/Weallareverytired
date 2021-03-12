package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		/* ask user to enter age
		 * based on the age we will define
		 * if age is from 1 - 3 --> you are a baby
		 * if age is from 3 - 5 --> you are a bigger baby
		 * if age is from 5 - 12 --> you are a kid
		 * if age is from 13 - 19 --> you are a teenager
		 * if age is above 20 --> you are an adult
		 */
		
		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if (age>=1 && age<=3) {
			System.out.println(name+" you are a baby");
		}else if (age>3 && age<=5) {
			System.out.println(name+" you are a bigger baby");
		}else if (age>5 && age<=12) {
			System.out.println(name+" you are a kid");
		}else if (age>=13 && age<=19) {
			System.out.println(name+" you are a teenager");
		}else if (age>=20) {
			System.out.println(name+" you are an adult");
		}

	}

}
