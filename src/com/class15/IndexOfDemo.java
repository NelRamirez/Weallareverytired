package com.class15;

public class IndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Finds the index of a character or word
		
		String confusionPrincess="Gulshoda";
		System.out.println(confusionPrincess.indexOf('a'));
		
		//Searches for the letter a and gives us the index
		//Remember Strings are an array of characters
		//Arrays begin with index [0]
		//.indexOf() is case sensitive

		
		//More examples below. These were taken from repl.
		//These show other ways it can be used.
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";

	    System.out.println(str.indexOf('c'));//Print out the position of the first occurrence of "c".

	    System.out.println(str.indexOf(' '));//Print out the position of the first occurrence of " ".

	    System.out.println(str.indexOf(target1));//Print out the position of the first occurrence of the variable target1.

	    System.out.println(str.indexOf(target2));//Print out the position of the first occurrence of the variable target2.
	}

}
