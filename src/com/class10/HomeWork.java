package com.class10;

public class HomeWork {

	public static void main(String[] args) {
		
		
		String[] cars= {"Skyline", "Silvia", "RX7", "Evolution", "Fairlady Z", "AE86"};
		
		for(String c:cars) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("---- Second way ----");
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		System.out.println("---- Task 2 ----");
		
		
		String[] animals= {"Panda", "Wolf", "Shiba Inu", "Pomeranian", "Husky", "Pitbull"};
		
		for(String a:animals) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("---- Second way ----");
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		

	}

}
