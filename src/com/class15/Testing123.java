package com.class15;

import java.util.Scanner;

public class Testing123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//repl testing delete later
		
		String name="Timmy";
		
		
		System.out.println(name.length());
		
		
		
		Scanner scan=new Scanner(System.in);
	    String input=scan.nextLine();

	    System.out.println("The first 3 letters of "+input+" is "+input.substring(0,3));

	    
	    System.out.print("In:");
	    String word = scan.nextLine();
	    //write your code below

	    for(int i=0; i<word.length(); i+=3){
	      System.out.println(i);
	    }
	    
	    
	    
	    
	}

}
