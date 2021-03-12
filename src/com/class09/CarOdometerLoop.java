package com.class09;

public class CarOdometerLoop {

	public static void main(String[] args) {
		//Car odometer style nested loop
		
		for (int i=0; i<=9; i++) {
			
			for (int j=0; j<=9; j++) {
				
				for (int a=0; a<=9; a++) {
					
					for (int b=0; b<=9; b++) {
						System.out.println(i+" "+j+" "+a+" "+b);
						
					}
				}
			}
		}
		
		
		System.out.println("---- Clock ----");
		
		for (int h=0; h<=24; h++) {
			
			for (int m=0; m<=60; m++) {
				
				if (h <10 && m<10) {
					System.out.println("0"+ h + ":0" + m);
				}else if (h<10 && m>=10) {
					System.out.println("0"+h+":"+m);
				}else if (h>=10 && m<10) {
					System.out.println(h+":0"+m);
				}
				else {
					System.out.println(h+":"+m);
				}
				
				
				
			}
		}
		
		System.out.println("---- Clock Nested if ----");
		
		
		
	for (int h=0; h<=24; h++) {
			
			for (int m=0; m<=60; m++) {
				
				if (h <10) {
					if (m<10) {
						System.out.println("0"+ h + ":0" + m);
					}else {
						System.out.println("0"+h+":"+m);
					}
				}else {
					
					if (m<10) {
						System.out.println(h+":0"+m);
					}else {
						System.out.println(h+":"+m);
					}
					
				}
			}
		}
	
	
	System.out.println("---- Multiplication Table ----");
	
	
	for(int one=1; one<=9; one++) {
		
		for(int two=1; two<=9; two++) {
			System.out.println(one+" * "+two+" = "+(one*two));
		}
	}
	
	
		
		
		
		

	}

}
