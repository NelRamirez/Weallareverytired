package com.class04;

import java.util.Scanner;

public class HwTask3 {

	public static void main(String [] args) {
		
				//Task #3
		
				Scanner inp=new Scanner(System.in);
		
				System.out.println("Please enter your city");
				
				String city=inp.nextLine();
				
				System.out.println("Please enter your temp");
				
				double temp=inp.nextInt();
				
				double tempT=(temp-32) * 5/9;
				
				System.out.println("Temperature in "+city+ " is "+tempT);
				
	}
}
