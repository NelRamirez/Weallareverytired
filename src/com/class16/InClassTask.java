package com.class16;

public class InClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Hello my name is Nelson.";
		
		System.out.println(var1.replace(" ",""));
		
		String var2="iPhone12$1,000!";
		
		System.out.println(var2.replaceAll("[^a-z A-Z]","").length());
		
		//If for some reason we had spaces in our string and want to remove them as well
		
		String a="Is it Saturday? Is it Raining? Do we have a Java Class today?";
		
		String[] b = a.split("[?]");
		
		System.out.println(b.length);
		
		//This way works as well
		System.out.println(a.split("[?]").length);
		
		
		
		

	}

}
