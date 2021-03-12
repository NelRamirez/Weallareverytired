package com.class11;

public class Hw4 {

	public static void main(String[] args) {
		//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
		//Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
		
		int sum =0;
		String[] []countries= {
			{"Cuba","Dominican Republic","Belize","Nicaragua","USA."},
			{"Ecuador","Peru","Venezuela","Brazil","Argentina","Bolivia.",},
			{"Finland","Denmark","Austria","Croatia","Germany."},
			{"China","Iran","Japan","Cambodia","Vietnam","India."},
			{"Algeria","Ethiopia","Ghana","Kenya."}
	};
	  for (String[] array:countries) {
		for (String count:array) {
				System.out.print(count+" ");
		}
				System.out.println();
		}
System.out.println("\n===========================Different Forloop================================");
		for(int a=0; a<countries.length; a++) {
			for(int b=0; b<countries[a].length; b++) {sum++;
			{
		      }System.out.print(countries[a][b]+" ");			
		}	
				System.out.println();				
	}
		System.out.println("\nThe number of countries stored are "+sum);
}

		
		
	}


