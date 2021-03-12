package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		/* We're playing the lottery and we have a winning number: 17
		 * We need to keep asking a user to enter any number from 1-100
		 * Until correct number is entered
		 */
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		
		
		do {
			System.out.println("Please enter any number from 1-100 to win");
			num=input.nextInt();
		}while(num!=lotteryNumber);
		
		System.out.println("Congrats you entered "+num+" which is the lucky number");
		
		
		
		
		
		
		
		
	}

}
