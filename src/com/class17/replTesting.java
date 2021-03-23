package com.class17;

public class replTesting {
	
	void clock(int hour, int min) {
		System.out.println(hour+":"+min);
	}
	
	 void upperCase(String var1){
		    System.out.println(var1.toUpperCase());
		  }
	 
	 int sumEvenToX(int x){
		    for(int i=1; i<=x; i++){
		      return i;
		    }
			return x;
		  }

	public static void main(String[] args) {
		replTesting obj=new replTesting();
		
		obj.clock(11, 30);
		
		obj.upperCase("hello");
		
		System.out.println(obj.sumEvenToX(10));
	}

}
