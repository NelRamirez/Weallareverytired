package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int num=1;
		
		while (num<=5) { //While loop is used more often in programming compared to do while
			System.out.println(num);
			num++;
		}
		
		System.out.println("---- Do While ----");
		
		int num1=1;
		
		do {
			System.out.println(num1);
			num1++;
			
		}while (num1<=5);
		
		//While - checks the condition then executes
		//Do - first executes then checks the condition after
		
		//Even if the condition is false DO will execute your code at least one
		
	}

}
