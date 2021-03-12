package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		
		System.out.println("Please enter any number from 1-100");
		num=input.nextInt();
		
		while(num!=lotteryNumber) {
			System.out.println("Please enter any number from 1-100");
			num=input.nextInt();
		}
		
		System.out.println("Congrats you entered "+num+" which is the lucky number");

	}

}
