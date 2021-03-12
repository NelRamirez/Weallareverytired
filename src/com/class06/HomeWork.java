package com.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		//Task #1
		
		Scanner scan=new Scanner(System.in);
		String country, language;
		
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "usa":
			language="English";
			break;
		case "el salvador":
			language="Spanish";
			break;
		case "germany":
			language="German";
			break;
		case "japan":
			language="Japanese";
			break;
		case "brazil":
			language="Portuguese";
			break;
		default:
			language="Unknown";
			break;
			}
		
		System.out.println("You speak "+language);		
	}

}
