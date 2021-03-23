package com.class17;

public class Employee {
	//In class task
	/*
	 * Create a Class called Employee:
	 * Create three  variables  empID , salary and set the CEO to "Sumair"
	 * Create two objects of the class Employee
	 * Set the value of eID, salary for each of the objects
	 * Print out the eID , salary and  CEO for each of the objects
	 */
	
	String empID;
	int salary;
	static String ceo="Sumair";
	
	public static void main(String[] args) {
		
Employee emp=new Employee();
		
		emp.empID="12345";
		emp.salary=100000;
		
		System.out.println(emp.empID+" salary "+emp.salary+" CEO "+ emp.ceo);
		
		
		Employee emp2=new Employee();
		emp2.empID="54321";
		emp2.salary=125000;
		
		System.out.println(emp2.empID+" salary "+emp2.salary+" CEO "+ emp2.ceo);
		
		
	}

}
