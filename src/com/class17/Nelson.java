package com.class17;

public class Nelson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to reverse an int
	
		
		int salary=10030002;
		StringBuilder sb=new StringBuilder(String.valueOf(salary));//Converts the int to a string
		sb.reverse();//Reverse the numbers
		
		salary=Integer.parseInt(sb.toString());//Convert the now reversed numbers which are a string back into an int
		System.out.println(salary);//print the reversed int

	}

}
