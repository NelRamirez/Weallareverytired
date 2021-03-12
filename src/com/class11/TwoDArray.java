package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
		
		//2D Arrays - It's an array of arrays. An array of single dimensional arrays
		//An easy way of thinking about it is: int[row][column]
		
		
		int[][] num=new int [3][4];
		//First array/first row
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		//Second array/Second row
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//Third array/Third row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		System.out.println(num[1][3]);//If you wanted to print 40
		System.out.println(num[2][2]);//300
		
		
		System.out.println("---- Another way of creating a 2D array ----");
		//Faster way of doing it.
		
		int[][] numbers= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300},
		};
		
		System.out.println(numbers[0][2]);//3
		System.out.println(numbers[1][1]);//20
		
		//what is the output?
		int sum=numbers[1][2]+numbers[0][3];
		System.out.println(sum);//34
		
		//what is the output?
		//System.out.println(numbers[0][4]);//Array index out of bounds because there is no [0][4]
		
		numbers[2][2]=500;//changing the value of previous 300 to 500
		System.out.println(numbers[2][2]);
		
		
		

	}

}
