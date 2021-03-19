package com.class11;

public class Task3 {
public static void main(String [] args) {
	
	String[][]cars = {
			{"Tesla","Ford","Cadillac"},//row 1 array
			{"Audi","Volkswagen","Porsche"},//row 2 array
			{"Kia","Hyundai"},
			{"Fiat","Ferrari","Lamborghini"},
	};
	
	System.out.println("\n_________1st Enhanced For Loop_________");
	
	for(String[]car:cars) {
		
		System.out.println();
		
		for(String carr:car)
			
	{System.out.print(carr+" ");
	}
	}
		
		{System.out.println("\n\n_________2nd Nested For Loop_________");}
	
		for(int r=0;r<cars.length;r++) 
			
		{System.out.println("");
			for(int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
			}

		}
		
}
}


