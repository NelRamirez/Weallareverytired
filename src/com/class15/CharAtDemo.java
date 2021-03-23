package com.class15;

public class CharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings are arrays of characters
		
		String name="Roheen";
		System.out.println(name.charAt(0));//Arrays begin with 0. in this case R is the first letter
		System.out.println(name.charAt(2));// h is at index [2]
		
		int sum=0;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='e') {
				System.out.println("e found");
			}
		}
		System.out.println(sum+" e's are found");

	}

}
