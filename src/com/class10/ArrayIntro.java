package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		num=20;
		System.out.println(num);
		
		
		int[] array=new int[5];
		array [0]=10;
		array [1]=12;
		array [2]=15;
		array [3]=9;
		array [4]=13;
		
		System.out.println(array[0]+array[4]);
		
		double [] numbers=new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		//Arrays are fixed in size
		
		String[] names=new String[3];
		names[0]="Jahanzeb";
		names[1]="Ozoda";
		//names[2]="Alec"; //null
		//names[3]="Nelson";// ArrayIndexOutOfBoundsException
		
		System.out.println(names[2]);//if no values are stored compiler adds default values to the array --> 0 or null
		
		boolean[] b=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("Size of an array is "+ size);
	

	}

}
