package com.class12;

import java.util.Scanner;

public class JavaBinksHw2Copy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n - Group Java Binks -  \n");
		System.out.println("\tHW #2 \n");

		int [][] numbers = { 
				
				{1,2,3},
			    {4,5,6,},
		        {7,8,9}
			};
        System.out.println(" 2D Array Of Numbers");
        for (int row = 0; row < numbers.length; row++) {
        System.out.println("");
        for (int col = 0; col < numbers.length; col++) { 		
        System.out.print(numbers[row][col] + ", ");
				
			}
		}	
		System.out.println("\n\n 2D Array Of Even Numbers\n");
		System.out.print("  {  ");
	    for (int row = 0; row < numbers.length; row++) { 
        for (int col = 0; col < numbers.length; col++) { 	if(numbers[row][col]%2==0) {	
        System.out.print(numbers[row][col] + ", ");
        }
			}
		}
	    
		System.out.print("}");
        
  			System.out.println("\n\n\n\n- - - - - - - - - - - ");	
  	        System.out.println("\n 2nd Method Using Scanner\n");
  			System.out.println(" Enter any 9 numbers.");
  			
  			int[][] array = new int[3][3];
  			int x =0;
  			
	        {for (int row = 0; row < array.length; row++) {
	        	System.out.print("Enter: ");
	        	
	        array[row][x] = scan.nextInt();
	        
	        for (int col = 0; col < array.length; col++) 
				{ System.out.print("Enter: ");
				array[row][col] = scan.nextInt();}
					}
	        }
  			System.out.println(" 2D Array Of Numbers");
  			for (int row = 0; row < numbers.length; row++) {
  	        System.out.println("");
  	        for (int col = 0; col < numbers[row].length; col++) { 		
  	        System.out.print(numbers[row][col] + ", ");
  					
  				}}	
  			System.out.println("\n\n 2D Array Even Numbers\n");
  			System.out.print("  {  ");
  		    for (int row = 0; row < numbers.length; row++) { 
  	        for (int col = 0; col < numbers[row].length; col++) { 	
  	        	if(numbers[row][col]%2==0) {	
  	        System.out.print(numbers[row][col] + ", ");
  	        }
  				}}
  			System.out.print("}");  				 
}

	}
