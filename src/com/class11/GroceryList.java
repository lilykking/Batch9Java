package com.class11;

public class GroceryList {

	public static void main(String[] args) {
		
		String[][]grocery = {
				
				{"Veggies","Carrots","Broccoli","Kale"},
				{"Fruits","Mango","Apple","Strawberry"},//row 1 array
				{"Dairy","Cheddar","Parmesean","Mozarella"},//row 2 array
				{"Sweets","Cake","Pie","Cookies"},
			
		};
		
		//Arrays
		
		System.out.println("\n_________1st Enhanced For Loop_________");
		
		for(String[]g:grocery) {
			
			System.out.println();
			
			for(String gr:g)
				
		{System.out.print(gr+" ");
		}
		}
			
			{System.out.println("\n\n_________2nd Nested For Loop_________");}
		
			for(int r=0;r<grocery.length;r++) 
				
			{System.out.println("");
				for(int c=0; c<grocery[r].length; c++) {
					System.out.print(grocery[r][c]+" ");
				}

			}
			
	}
	}