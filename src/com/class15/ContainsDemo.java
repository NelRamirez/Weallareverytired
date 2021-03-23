package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checks to see if if contains. Could be used for special characters, words, or even complete sentences
		
		String var="This is a demo of contain #!$*";
		System.out.println(var.contains("#"));
		if(var.contains("#")) {
			System.out.println("# are not allowed");
		}
		
		System.out.println(var.contains("demo"));
		
		System.out.println(var.startsWith("This is a demo"));//Checks to see if it starts with
		System.out.println(var.endsWith("*"));//Checks to see if it ends with
		
		System.out.println(var.contains("Hello"));
		
		System.out.println("--------- More Examples -----------");
		
		if(var.contains("#") || var.contains("!")) {
			System.out.println("#,! are not allowed");
		}

	}

}
