package com.class13;

public class Dog {
	
	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void sleep() {
		System.out.println("ZZZZzzzz..");
	}
	
	public void bark() {
		System.out.println("Ruff Ruff");
	}
	
	public void eat() {
		System.out.println("Nom nom");
	}
	
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	
	public static void main(String[] args) {
		Dog bulldog=new Dog();
		bulldog.age=5;
		bulldog.breed="American Bulldog";
		bulldog.size="Large";
		bulldog.color="Pink";
		bulldog.bark();
		bulldog.eat();
		bulldog.sleep();
		bulldog.look();
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.breed="Beagle";
		beagle.size="Large";
		beagle.color="Light Grey";
		beagle.look();
		
		
		
		
	}
	
	
	
	

}
