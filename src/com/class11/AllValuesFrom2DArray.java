package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria","Oakton", "Arlington", "VA Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacrramento", "Santa Barbara", },
				{"Miami", "Orlando", "Tampa", "Tallahasse"},
		};
		
		
		System.out.println(usa.length);//5 total single arrays/ 5 rows total
		System.out.println(usa[0].length);//5 elements inside our first array / 5 columns in the first row
		System.out.println(usa[1].length);//3 elements inside second array / 3 columns in second row
		System.out.println(usa[2].length);//4 elements inside third array / 4 columns in third row
		
		for(int r=0; r<usa.length; r++) {//iterates over rows
			
			for(int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("---- Using nested for each loop ----");
		
		for(String[] cities:usa) {
			for(String city:cities) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
		
		
		

		
	}

}
