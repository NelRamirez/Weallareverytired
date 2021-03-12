package com.class10;

public class ReviewClass4Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int i=10;
		int j=20;
		
		System.out.println("int i=10; \n"+i);//10
		i=i+j+20;
		System.out.println("int i=10; \n"+i);//50
		i+=i+10; //i=i+10+i
		System.out.println("int i=10; \n"+i);//110
		i++;
		System.out.println("int i=10; \n"+i);//111
		++i;
		System.out.println("int i=10; \n"+i);//112
		
		i=10;
		System.out.println("++i "+(++i));
		System.out.println("i++  "+(i++));
		
		

	}

}
