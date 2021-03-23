package com.class17;

public class StringBuilderVsString {

	public static void main(String[] args) {
		
		//Strings are immutable
		//String builders are mutable
		
		String var1="Meerim";
		String var2="Aziz";
		String var3="Afzal";
		String var4="MJ";//Recommended way
		String var5=new String("Angelo");//Not recommended when creating string objects
		var4="Ram";
		
		StringBuilder sb1=new StringBuilder("Meerim");//This is how create a String Builder
		StringBuilder sb2=new StringBuilder("Aziz");
		StringBuilder sb3=new StringBuilder("Afzal");
		StringBuilder sb4=new StringBuilder("MJ");
		
		System.out.println(sb1.reverse());//one of the methods that can be used with String Builder
		
		System.out.println(sb1);//example of how it is mutable
		
		
		
	}

}
