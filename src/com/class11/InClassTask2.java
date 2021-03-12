package com.class11;

public class InClassTask2 {

	public static void main(String[] args) {
		
		String[][] cars= {
				{"Viper", "Mustang", "Corovette", "Shelby", "Challenger"},
				{"E92 M3", "F82 M4", "E36 M3", "E46 M3"},
				{"Genesis"},
				{"Testarossa", "F40", "458" },
		};
		
		for(int r=0; r<cars.length; r++) {
			
			for (int c=0; c<cars[r].length; c++) {
				
				System.out.print(cars[r][c]+" ");
			}
				System.out.println();
		}
		
		System.out.println("--------");
		
		
		for(String[] auto:cars) {
			
			for(String veh:auto) {
				System.out.print(veh+" ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
