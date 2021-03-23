package com.class11;

public class ReplPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] nums = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		
		 for(double [] numero:nums){
		     for(double n:numero){
		    	 n=n*2;
		       System.out.print(n+" ");
		     }
		     System.out.println();
		   }
		 
		 System.out.println("----------");
		 
		 int[][] a = {
					{-5,-2,-3,7},
					{1,-5,-2, 2},
					{1,-2, 3,-4}
				};
		    int sum=0;

		    for(int r=0; r<a.length; r++){
		      for (int c=0; c<a[r].length; c++){
		        sum=sum+a[r][c];
		      }
		      System.out.println(sum);
		    }

	}

}
