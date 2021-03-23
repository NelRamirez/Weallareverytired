package com.class17;

public class Students {
	
	/*
	 * Create a Class called Students
	 * Create three  variables  studentName , studentID  and  numberOfStudents
	 * Create three objects of the Students Class 
	 * Set the value for  studentName , studentID and increment the numberOfStudents for each object
	 * Print out  total number of students
	 */
	
	String studentName;
	String studentID;
	static int numberOfStudents;
	
	
	public static void main(String[] args) {
		

		Students stu=new Students();
		
		stu.studentName="Nelson";
		stu.studentID="458";
		numberOfStudents++;
		System.out.println(numberOfStudents);
		
		Students stu2=new Students();
		
		stu2.studentName="Murakami";
		stu2.studentID="459";
		numberOfStudents++;
		System.out.println(numberOfStudents);
		
		Students stu3=new Students();
		
		stu3.studentName="Jordan";
		stu3.studentID="500";
		numberOfStudents++;
		System.out.println(numberOfStudents);
		
		
		
		
		
	}

	
	
}
