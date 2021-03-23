package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// This is tied to MoreMethodExamples Class
		
		MoreMethodsExamples obj1=new MoreMethodsExamples();
		
		System.out.println(obj1.print());
		
		System.out.println(obj1.doubleTheValue(10));
		//obj1 is the name of the object
		//doubleTheValue is the name of the method that is being called.
		//10 is the value that you want to be executed
		
		obj1.isRaining(true);
		//System.out.println(obj1.isRaining(true)); error as we are not returning
		
		obj1.print5Times();
		
		System.out.println(obj1.greater(10, 20));
		
		obj1.evenOrOdd(10);
		
		double [] arr= {10.2, 25, 30};
		System.out.println(obj1.returnTheArray(arr));
		
		
		
		
		System.out.println(obj1.isMirror("aba"));
		System.out.println(obj1.isMirror("abcdef"));

		
	}

}
