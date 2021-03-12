package com.class02;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		name="Nelson";
		
		String greeting="Good Morning!";
		String phoneNumber="123-456-7890";
		
		String stringNumber="12";
		
		String Space=" ";
		
		String letter="A";
		String letter2="A ";
		char oneLetter='A';
		
		
		//Hello, my name is Nelson
		
		System.out.println("Hello my name is " + name);
		
		//How are you Nelson?
		
		System.out.println("How are you "+ name);
		
		int age=25;
		//I am 25
		
		System.out.println("I am " +age);
		
		char grade='A';
		//Nelson is A student
		
		System.out.println(name+" is "+grade+" student");
		
		/*
		 * String concatenation operator + can be used when
		 * we attached string to another string
		 * we attach string to a number
		 * we attach string to any character or boolean
		 */
		
		String car="Nissan";
		int year=2004;
		
		// I drive a 2004 Nissan
		
		System.out.println("I drive a "+year+" "+car);
		
		String computer="Macbook Pro";
		int memory=256;
		
		//Nelson has a Macbook Pro with 256 GB memory
		
		System.out.println(name+" has a "+computer+" with "+memory+" GB memory");
		
		String combinedValue = year+" "+car;//2004 Nissan
		System.out.println(combinedValue);
		
		int day=7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
		
	
	}

}
