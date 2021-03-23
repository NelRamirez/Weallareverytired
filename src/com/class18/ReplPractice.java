package com.class18;

import java.util.Scanner;

public class ReplPractice {
	
	String name(String str) {
		return str.toUpperCase();
	}
	
	int sumEvenToX(int x){
	    for(int i=1; i<=x; i++){
	      
	    }
		return x;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner inp = new Scanner(System.in);
	    //System.out.print("In:");
	    //String word = inp.nextLine();
	    
	    //for(int i=0; i<word.length(); i++) {
	    //	System.out.println(word.charAt(i));
	    //}
	    
	    ReplPractice obj=new ReplPractice();
	    
	    System.out.println(obj.name("test"));
	    
	    System.out.println(obj.sumEvenToX(10));
	    
	    

	}

}
