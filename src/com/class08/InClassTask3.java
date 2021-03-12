package com.class08;

import java.util.Scanner;

public class InClassTask3 {

	public static void main(String[] args) {
		
		//In Class task 3. We added an if to it
		
		Scanner scan=new Scanner(System.in);
		int start;
		int end;
		
		System.out.println("Please enter starting point");
		start=scan.nextInt();
		
		System.out.println("Please enter ending point");
		end=scan.nextInt();
		
		int sumOdd = 0;
		int sumEven = 0;
		
		if (start < end) {		
		for(int i=start; i<=end; i++) {
			
			if (i%2!=0) {
				sumOdd+=i;
			}else {
				sumEven+=i;
			}
		}
		
		System.out.println("Summ of Odd numbers from range "+start+" to "+end+" is = "+sumOdd);
	
		System.out.println("Summ of Even numbers from range "+start+" to "+end+" is = "+sumEven);
		}
	}

}
