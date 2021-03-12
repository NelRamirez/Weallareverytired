package com.class11;

public class Repl85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
			      {-5,-2,-4,7},
			      {1,-5,-2,2},
			      {1,-2,3,-2}
			    };
			    int even=0;
			     for (int i=0; i<a.length; i+=2){
			            for (int b=0; b<a[i].length; b++){
			                  even+=a[i][b];
			            }
			     }
			     System.out.println(even);
		
	}

}
