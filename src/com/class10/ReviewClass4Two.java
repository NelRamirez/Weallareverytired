package com.class10;

public class ReviewClass4Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int i=0;
		System.out.println("int i=10; \n"+i);//
		i=i-20;
		System.out.println("int i=10; \n"+i);//
		i-=10;
		System.out.println("int i=10; \n"+i);//
		i--;
		System.out.println("int i=10; \n"+i);//
		--i;
		System.out.println("int i=10; \n"+i);//
		
		
		i=10;
		System.out.println("--i"+(--i));//first decrement the value then use it
		System.out.println("i--  "+(i--));//first use the value then decrement
		System.out.println("i  "+i);//in the next line updated value will reflect in i
	

	}

}
