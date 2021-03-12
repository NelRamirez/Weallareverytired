package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		
		int [] numbers= {10, 14, 78, 5, 90};
		
		//for each, enhanced for loop, advanced for loop used ONLY WITH ARRAYS!! OR COLLECTIONS!!
		
		for(int num:numbers) {
			
			System.out.print(num+" ");
			
		}
		
		System.out.println();
		
		
		String[] name= {"Nelson", "Yovanna", "Elizabeth", "Lily", "Ariana", "Jonathan", "Sami"};
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("------------");
		
		for(String n:name) {//Enhanced for loop
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		System.out.println("------------");
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		for(char grade:grades) {
			
			System.out.print(grade+" ");
		}
		
System.out.println();
		
		System.out.println("------------");
		
		boolean [] boo= {true, false, false, false, true};
		
		for(boolean b:boo) {
			
			System.out.print(b+" ");
			
		}
		
		System.out.println();
		System.out.println("-------------");
		
int[] num= {10, 14, 78, 5, 90, 76};
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]%2==0) {
				System.out.print(num[i]+" ");
			}
		}
			
			System.out.println();
			System.out.println("-----------");
			

			int [] numeros= {10, 14, 78, 5, 90};
			
			
			for(int numb:num) {
				
				if(numb%2==0) {
				
				System.out.print(numb+" ");
				}
			}
			
			
			
		
		
		

	}

}
