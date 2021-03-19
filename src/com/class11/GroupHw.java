package com.class11;

import java.util.Scanner;

public class GroupHw {

	public static void main(String[] args) {
		
		//@Author: Lily King
		//@Date: 03/06/2021
		//@Program: Group HW (1)

		// Create a 2D array of integer type and store
		// numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n - Group Java Binks -  \n");
		System.out.println("\tHW #1 \n");

		int [][] numbers = { 
				
				{1,2,3},
			    {4,5,6,},
		        {7,8,9}
			};
	
		System.out.println(" 2D Array Of Numbers");
		
		int sum = 0;
		
		for (int row = 0; row < numbers.length; row++) {
        System.out.println("");
        for (int col = 0; col < numbers.length; col++) { 		
        System.out.print(numbers[row][col] + ", ");
				
						sum+=numbers[row][col];
		
			}
		}
		System.out.println("\n\n 2D Array Numbers Sum\n");
        System.out.println("     Sum = "+sum);
        
        
        //end of First method
        //beginning of 2nd method
        
        
        
		System.out.println("\n\n - - - - - - - - - - - ");	
        System.out.println(" 2nd Method Using Scanner\n");
		System.out.println(" Enter any 9 numbers.");
		
		int[][] array = new int[3][3];
        {
		
		for (int row = 0; row < array.length; row++) { 
        for (int col = 0; col < array.length; col++) 
			{
			array[row][col] = scan.nextInt();}
				}


		System.out.println("\n 2D Array Of Numbers");
		int sum2 = 0;
		for (int row = 0; row < array.length; row++) {
        System.out.println("");

			for (int col = 0; col < array.length; col++) { 	
			System.out.print(array[row][col] + ", ");
				sum2+=array[row][col];}
			}
		System.out.println("\n\n 2D Array Numbers Sum\n");
		System.out.println("Sum  = "+sum2);
	}



	}
}

