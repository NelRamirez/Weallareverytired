package com.class17;

public class LocalVarsUse {
	
	//Local variables are memory efficient
	
	double salary=120000;//Instance variable. It is created and stays even if it doesn't get used
	void printInfo() {
		String name="Nelson";//name is a local variable. It only gets created when the method is called.
		System.out.println(name+" "+salary);
	}
	
	void printSalaryPlusBonus() {
		double bonus=50000;
		System.out.println(salary+bonus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVarsUse obj=new LocalVarsUse();
		obj.printInfo();
		obj.printSalaryPlusBonus();

	}

}
