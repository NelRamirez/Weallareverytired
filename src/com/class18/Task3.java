package com.class18;

public class Task3 {
	
	private static String vowelsOnly(String input) {
		
		return input.replaceAll("[^a,e,i,o,u]", "");
	}
	
	
	

	public static void main(String[] args) {
		
		//Since the method vowelsOnlys is private we have to access it in the same class
		//private can't be accessed outside of it's class.
		
		
		System.out.println(vowelsOnly("Nelson"));
		
	}

}
