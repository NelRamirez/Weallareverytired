package com.class03;

public class CompoundOperator {
	
	public static void main(String [] args) {

	int num = 100;
	
	num=num+100;
	
	System.out.println(num);
	
	num=num-50;
	
	System.out.println(num);
	
	System.out.println("-------------------");
	
	int num1=100;
	
	num1+=100;//num1=num1+100;
	System.out.println(num1);//200
	
	num1-=50;
	System.out.println(num1);//150
	
	num1/=5;
	System.out.println(num1);//30
	
	num1*=10;
	System.out.println(num1);//300
	
	num1+=20;
	System.out.println(num1);//320
	
	int a=1;
	//a=a+10;
	a+=10;
	System.out.println(a);
	
	int task=1000;
	task+=500;
	System.out.println(task);
	task-=67;
	System.out.println(task);
	
	int cakePiece=11;
	cakePiece/=4;
	System.out.println(cakePiece);
	
	int cake=25;
	cake%=7;
	System.out.println(cake);
	
	
	
	
	}
}
