package com.class11;

public class Hw9 {

	public static void main(String[] args) {
		//Write a program to find the second largest number
		
		
		int[]arr2= {900,200,3, 300, 300, 45,89,76,45,125,36,145};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>large) {
				secondLarge=large;
				large=arr2[i];
				
			}else if(arr2[i]>secondLarge && arr2[i]!=large) {
				secondLarge=arr2[i];
			}
			
		}
		System.out.println("Larget number is "+large);
		System.out.println("Second largets number is "+secondLarge);
	}

}
