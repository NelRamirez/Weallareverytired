package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("34343", ""));//Replaces 34343 with "" which is nothing
		
		System.out.println(var1.replaceAll("[0-9]", ""));//Replaces numbers from 0-9
		
		var1="974568794095jksdbfjshjuy";
		System.out.println(var1.replaceAll("[a-z]", ""));//Replaces everything from lower case a-z
		
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));//Replaces everything from a lower and upper case a-z/A-Z
		
		
		var1="95485aknhgfnAKDNKFBFDD@#$%^&*(";
		System.out.println(var1.replaceAll("[^a-z]", ""));//The ^ in [^a-z] means remove everything except for the letters from a-z. Similar to the ! not symbol
		System.out.println(var1.replaceAll("[A-Z a-z 0-9]", ""));//You can combine with letters and numbers as well
		System.out.println(var1.replaceAll("[^a-z]", " "));//If you add a space in between the quotation marks "" is adds it to the string
		
		
		System.out.println(var1);
		

	}

}
