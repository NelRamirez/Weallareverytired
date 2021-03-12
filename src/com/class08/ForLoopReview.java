package com.class08;

public class ForLoopReview {

	public static void main(String[] args) {
		
		/* Create a multiplication table
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 * 
		 * 
		 * 1*10=10
		 */
		
		int num=1;
		int mult;
		
		for(int i=1; i<=10; i++) { //our int i=1 is executed once then on it's second loop around it adds 1 (i++). It continues to loop and add one until our condition *(i<=10;)* is no longer true.
			
			mult=num*i;
			System.out.println(num+" * "+i+" = "+mult);
			
		}
		
		
		
		

	}

}
