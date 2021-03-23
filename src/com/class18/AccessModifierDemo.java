package com.class18;

public class AccessModifierDemo {
	
	public String name;
	private String bankAccountPassword;
	String ssnNumber;
	
	public void park() {
		System.out.println("Everyone can go to a public park");
	}
	
	void car() {
		System.out.println("Big bro can take my car. Please don't destroy it");
	}
	
	private void toothBrush() {
		System.out.println("No one should use it");
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(bankAccountPassword);
		System.out.println(name);
	}
	
	

}
