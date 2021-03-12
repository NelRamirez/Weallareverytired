package com.class07;

public class HomeWork {

	public static void main(String[] args) {
		
		
		//Calculate sum of odd and even numbers from 1-50
		
		System.out.println("---- Odd numbers ----");
		
		int total=0;
		
		for(int i=1; i<=50; i+=2) {
			total=total + i;
		}
		System.out.println(total);
		
		System.out.println("---- Even numbers ----");
		
		int result=0;
		
		for(int i=0; i<=50; i+=2) {
			result=result + i;
		}
		System.out.println(result);
		
		System.out.println("---- Alternate way ----");
		//Preferable way. It's more efficient
		
		int odd = 0;
		int even = 0;
		
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				even+=i;
				
			}else {
				odd+=i;
			}
		}
		
		System.out.println(odd);
		System.out.println(even);
	
	}

}
