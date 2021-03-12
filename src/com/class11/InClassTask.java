package com.class11;

public class InClassTask {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
		};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		//You can also create a variable to hold
		String name=names[0][1]+" "+names[1][0];
		System.out.println(name);
		
		
		String[][] student= {
				{"Nelson","Brian","Michael","Max"},
				{"A","B"},
		};
		
		System.out.println("-- Second Task --");
		
		System.out.println(student[0][0]+" "+student[1][0]);
		System.out.println(student[0][2]+" "+student[1][1]);

	}

}
