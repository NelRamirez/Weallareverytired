package com.class11;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to swap 2 numbers without a temporary variable?

		
		int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y);
	}

}
