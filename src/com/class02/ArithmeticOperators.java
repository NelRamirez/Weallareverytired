package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=5;
		
		// +, -, *, /, %
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is = 15
		
		System.out.println("sum of number "+num1+" and "+num2+" is = "+sum);//It will actually calculate it for you
		System.out.println("sum of number 10 and 5 is = 15");//in this case it would give you what you typed
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values "+divOfDouble);
		
		float n1=10.99f;
		float n2=90.99f;
		
		float divOfFloat=n2/n1;
		
		System.out.println("Result of division of 2 float values "+divOfFloat);
		
		//precedence "my dear aunt sally" Multi first, then div, then add, then sub
		int result=(10+2)*5;
		System.out.println(result);
		
		//modulus operator --> shows remainder of the divsion
		
		int mod=10%3;
		System.out.println("Remainder is = "+mod);//1
		
		int mod2=10%2;
		System.out.println("Remainder is = "+mod2);//3
		
		int r=20%7*3;//Equals 18. Let's break it down. How many times does 7 fit into 20? 2 times. 7*4=14 20-14=6. Then you're doing 6 * 3 = 18
		System.out.println(r);
	
		int wheels=3000;
		int coils=1500;
		int s15=22000;
		int total=wheels+coils+s15;
		
		System.out.println("The wheels cost me "+wheels+", the coilovers "+coils+", the car "+s15+". So far i've spent "+total+".");
		
		int engine=4000;
		int brideSeats=1500;
		int g=total+engine+brideSeats;
		
		System.out.println("I still need the engine, it's "+engine+" plus seats "+brideSeats+". I will have spent "+g+" to get the car done.");
				
	
		

	
		
	}

}
