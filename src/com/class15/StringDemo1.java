package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
	
		
		//Print out how many characters are in a string
		
		String name="Nelson"; //Mostly used because of shorter syntax
		String name1=new String("Nelson"); //Creating object of the string class
		
		
		System.out.println(name);
		//Length -> number of characters in a String object
		
		System.out.println(name.length());
		
		
		name="    Nelson";//Here we are simply reassining the value to name 
		int len=name.length();// calling a method because .length returns an int
		System.out.println(len);
		

	}

}
