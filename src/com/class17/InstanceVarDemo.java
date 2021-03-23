package com.class17;

public class InstanceVarDemo {
	
	String name;
	int age;
	void printInfo() {
		//If I am inside the same class and my method is not static
		//I can use my instance variables directly 
		double salary=120000;
		System.out.println(name+" "+age);
	}

}
