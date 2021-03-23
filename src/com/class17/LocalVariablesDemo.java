package com.class17;

public class LocalVariablesDemo {
	
	void printInfo(String name) {
		String phoneNumber="123456789";
		System.out.println(name);
	}
	
	void printInfoWithAddress(String name, String address) {
		System.out.println(name+address);
		//System.out.println(phoneNumber); CE Compiler error not defined
	}

	public static void main(String[] args) {
		
		//We can't access local variable outside of their scope "{"  "}"
		
		String name1="Local";
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		//System.out.println(i);//Can't print i because it is a local variable outside of it scope "{" "}"

		{
			int x=10;
			{
				int y=20;
				System.out.println(x);
			}
			//System.out.println(y); Compiler error. We can't access y because it is a local variable
		}
		
		
	}

}
