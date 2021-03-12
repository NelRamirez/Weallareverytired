package com.class05;

import java.util.Scanner;

public class HomeWorkPart2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double a, b, c, d;
		
		System.out.println("Enter 3 different numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		
		if (a>b && a>b) {
			d=a;
		}else if (b>a && b>c) {
			d=b;
		}else {
			d=c;
		}
		
		System.out.println(d+" is the largest number");
		
		

	}

}
