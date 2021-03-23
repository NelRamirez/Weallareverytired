package com.class18;

public class Account {
	
	private double actualAccountBalance;
	private String actualUserName;
	private String actualPassword;
	
	public boolean login(String enteredUserName, String enteredPassword) {
		if(enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean signUp(String enteredUserName, String enteredPassword, double enteredBalance) {
		
		if(enteredUserName.length()>15) {
			return false;
		}else {
			actualUserName=enteredUserName;
			actualPassword=enteredPassword;
			actualAccountBalance=enteredBalance;
			return true;
		}
	}
	
	boolean transferFunds(String password, double enteredAccountBalance) {
		if(password.equals(actualPassword) && enteredAccountBalance<=actualAccountBalance) {
			
			actualAccountBalance=actualAccountBalance-enteredAccountBalance;
			return true;
		}else {
			return false;
		}
	}

}
