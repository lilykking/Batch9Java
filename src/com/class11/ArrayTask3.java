package com.class11;

public class ArrayTask3 {

	public static void main(String[] args) {
		
		int counting =0;

		String[][]usa= {
				{"Alexandria","Oakton","Arlington","Virginia Beach","Fairfax"},//row 1 array
				{"Philly","Strassburg","Pittsburgh"},//row 2 array
				{"Boston","Quincy","Springfield","Burlington"},
				{"Los Angeles","Long Beach","San Francisco","Sacramento","Santa Barbara"},
				{"Miami","Orlando","Tampa","Tallahasee"},
				};
	
	for(int r=0;r<usa.length;r++) 	
		
	{System.out.println("");
	
		for(int c=0; c<usa[r].length; c++) { counting++;
		
			System.out.print(usa[r][c]+" ");					
		}

	}
	
	System.out.println("\n\nThe number of cities is "+counting);


			System.out.println("\n\n\n\nUsing nested for each loop");
			
			for(String[]cities:usa) {for(String city:cities) { 
				
				System.out.println(city+" ");
				}
			
		
		}
			
	}


}