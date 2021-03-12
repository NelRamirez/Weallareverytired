package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//shortcut to import for mac: cmd+shift+o
		//shortcut to import for windows: ctrl+shift+o
		
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);//creating scanner
		System.out.println("Please enter any text");
												//captures entire text with spaces
		String text=scan.nextLine();//scan.nextline(); --> Capture your input from console,
										//once you enter text you must HIT ENTER
		
		System.out.println("Text that i entered - " + text);
		
		System.out.println("Please enter your name ");
		
		String name=scan.next();//captures 1 word till space
		
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println("My name is "+name+" and I am "+age+" years old");
		
		
		//nextInt captures int
		//next.Line captures everything. All types of values
		//next only captures one word
		
		

	}

}
