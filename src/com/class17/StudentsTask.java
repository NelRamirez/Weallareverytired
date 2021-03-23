package com.class17;

public class StudentsTask {
	
	/*
	 * Create a Class called Students
	 * Create three  variables  studentName , studentID  and  numberOfStudents
	 * Create three objects of the Students Class 
	 * Set the value for  studentName , studentID and increment the numberOfStudents for each object
	 * Print out  total number of students
	 */
	
	
	String studentName;//Instance variable
	String studentID;//Instance variable
	static int numberOfStudents;//Static because this will remain the same. At the moment it's value is 0

	public static void main(String[] args) {
		
		StudentsTask obj1=new StudentsTask();
		
		obj1.studentName="Nelson";
		obj1.studentID="12345";
		obj1.numberOfStudents++;//Value becomes 1
		System.out.println(obj1.studentID+" name "+obj1.studentName+" Number of students "+obj1.numberOfStudents);
		
		StudentsTask obj2=new StudentsTask();
		
		obj2.studentName="Yovi";
		obj2.studentID="6789";
		obj2.numberOfStudents++;//Value becomes 2
		System.out.println(obj2.studentID+" name "+obj2.studentName+" Number of students "+obj2.numberOfStudents);
		System.out.println(numberOfStudents);//Value stays 2
		

	}

}
