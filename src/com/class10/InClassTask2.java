package com.class10;

public class InClassTask2 {

	public static void main(String[] args) {
		
		String[] names=new String[7];
		names[0]="Nelson";
		names[1]="Yovanna";
		names[2]="Elizabeth";
		names[3]="Lily";
		names[4]="Ariana";
		names[5]="Jonathan";
		names[6]="Sami";
		
		String[] groups= {"Nelson", "Yovanna", "Elizabeth", "Lily", "Ariana", "Jonathan", "Sami"};
		
		System.out.println(groups[0]);
		
		System.out.println("--- Task 2 ---");
		
		String[] words= {"Java ", "Saturday ", "Day ", "coding ", "is "};
		
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		System.out.println("---- All Elements From An Array ----");
		
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

		
		

	}

}
