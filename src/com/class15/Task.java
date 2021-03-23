package com.class15;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Nel123";
		String pass="abc";
		String confirmPassword="abc";
		
		if(name.isEmpty()|| pass.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if (pass.length()<8) {
			System.out.println("Password is too short");
		}else if (pass.equals(name)) {
			System.out.println("Password cannot contain username");
		}else if(!pass.equals(confirmPassword)) {
			System.out.println("Passwords do no match");
		}else {
			System.out.println("Your username and password have been created");
		}
		

	}

}
