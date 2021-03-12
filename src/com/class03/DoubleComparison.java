package com.class03;

public class DoubleComparison {

	public static void main(String [] args) {
		
		//in class task
		
		double a = 10.5;
		double b = 5;
		if (a>b) {
			System.out.println("Double value "+a+" is larger than "+b+".");
			
		}else {
			System.out.println("Double value "+a+" is smaller than "+b+".");
		}
		System.out.println("----------------------------");
		
		int temp=10;
		if (temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
			System.out.println("It is very cold");
			System.out.println("if block");//just to show that everything in this block will be printed
		}else {
			System.out.println("Water will NOT freeze with with temperature "+temp);
			System.out.println("Else block");//show that everything inside this block will print
		}
		
		System.out.println("------------------");
		
		
		double money = 3;
		
		double $coke = 3;
		
		if(money==$coke) {
			System.out.println("I am buying a soda");
		}else {
			System.out.println("I need the exact amount");
		}
		
		System.out.println("------------------");
		
		boolean snow=true;
		
		if (snow) {
			System.out.println("Yay, I will play with the snow");
		}else {
			System.out.println("I am going to ride my bicycle");
		}
		
		System.out.println("-----------------");
		
		boolean summer=false;
				if(summer) {
					System.out.println("I am going to Florida");
				}else {
					System.out.println("I will stay home");
				}
		
		
		
	}
}
