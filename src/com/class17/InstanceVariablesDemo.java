package com.class17;

public class InstanceVariablesDemo {
	
	int number=10;//Instance variable
	void printNumber() {
		System.out.println(number);
		String name="Nelson";
	}
	void printNumbers2() {
		System.out.println(number);
		//System.out.println(name); CE because name is a local variable
	}

	public static void main(String[] args) {
		
		InstanceVariablesDemo obj=new InstanceVariablesDemo();
		System.out.println(obj.number);
		
		

	}

}
