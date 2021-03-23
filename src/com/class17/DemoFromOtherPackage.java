package com.class17;

import com.class18.AccessModifierDemo;
import com.class18.Task1;

public class DemoFromOtherPackage {

	public static void main(String[] args) {
		
		//Demo from package com.class18
		
		AccessModifierDemo obj1=new AccessModifierDemo();
		
		System.out.println(obj1.name);//Accessible because it is public
		//System.out.println(obj1.bankAccountPassword); Not accessible because it is private
		//System.out.println(obj1.ssnNumber); Not accessible because it is default

		
		Task1 obj2=new Task1();
		double[] arr= {10,20};
		
		//System.out.println(obj2.sumArrayElements(arr)); Error because "sumArrayElements" is a default method. Not Accessible in the package
		
	}

}
