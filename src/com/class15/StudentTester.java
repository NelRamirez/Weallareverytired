package com.class15;

public class StudentTester {

	public static void main(String[] args) {
		
		//In Student Tester we are creating an object from the Student class
		
		Student ramObj=new Student();//Creating an object
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentId="CS123";
		ramObj.schoolName="Syntax";
		ramObj.study();// Calling the method/behavior
		ramObj.payTuition();// Calling the method/behavior
		
		Student aimenObj=new Student();
		aimenObj.name="Aimen";
		aimenObj.age=26;
		aimenObj.studentId="CS456";
		aimenObj.schoolName="Syntax";
		aimenObj.study();
		aimenObj.payTuition();
		

	}

}
