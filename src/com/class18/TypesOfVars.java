package com.class18;

public class TypesOfVars {
	
	//Recap from class 17
	
	//DONT use non static variables with static method. You will get CE
	
			String name;
			static String companyName="Syntax";
			
			void printInfo() {
				System.out.println(name+" Company "+companyName);
			}
			
			static void printCompanyInfo() {
				//System.out.println(name);
				System.out.println(companyName);
			}

	public static void main(String[] args) {
		
		TypesOfVars obj1=new TypesOfVars();
		
		obj1.name="Ram";
		
		TypesOfVars obj2=new TypesOfVars();
		
		obj2.name="Aiman";
		

	}

}
