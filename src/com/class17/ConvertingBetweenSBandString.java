package com.class17;

public class ConvertingBetweenSBandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert String to StringBuilder
		
		//Similar to the casting we use with Primitive data types
		
		String var1="Nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();
		System.out.println(var1);
		

	}

}
