package com.class11;

public class testingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		System.out.println("hi");
		}
		
		System.out.println("----");
		
		for(int i = 0; i <= 5; i++ ) {
			   System.out.println("i = " + i );
			}

			//System.out.println("i after the loop = " + i );
		
		System.out.println("----");
		
		int k=3, tot=0;

		do{

		   tot=tot+k;

		   k++;

		} while(k<11);

		System.out.print(tot);
		
		System.out.println();
		System.out.println("----");
		
		int x=1;

		do{

		   x++;

		   System.out.print(x);

		}while(x<5);
		
		

	}

}
