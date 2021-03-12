package com.class10;

public class ReviewClass4 {

	public static void main(String[] args) {
		
		
		int i=10;
		System.out.println("int i=10; \n"+i);//10
		i=i+20;
		System.out.println("int i=10; \n"+i);//30
		i+=10;
		System.out.println("int i=10; \n"+i);//40
		i++;
		System.out.println("int i=10; \n"+i);//41
		++i;
		System.out.println("int i=10; \n"+i);//42
		
		
		
		i=10;
		System.out.println("++i "+(++i+(++i)));//23
		System.out.println("i++  "+(i++));
		
		
		i=10;
		System.out.println("++i "+(++i+(++i)));//23
		System.out.println("i++  "+(i++));

	}

}
