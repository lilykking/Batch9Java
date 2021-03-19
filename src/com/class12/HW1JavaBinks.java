package com.class12;
import java.util.Scanner;
public class HW1JavaBinks {
     public static void main(String[] args) {
		    //@Author: Lily King
			//@Date: 03/06/2021
			//@Program: Group HW (1) Java Binks 

			Scanner scan = new Scanner(System.in);
			
			System.out.println("\n - Group Java Binks -  \n");
			System.out.println("\tHW #1 \n");
			
			//Arrays

			int [][] numbers = { 
					
					{1,2,3},
				    {4,5,6,},
			        {7,8,9}
				};
		
			System.out.println(" 2D Array Of Numbers");
			
			int counting = 0;
			
			for (int row = 0; row < numbers.length; row++) {
				
	        System.out.println("");
	        
	        for (int col = 0; col < numbers[row].length; col++)
	        { 		
	        System.out.print(numbers[row][col] + ", ");
	        
					counting+=numbers[row][col];
					
				}
			}
			
			
			
			System.out.println("\n\n 2D Array Numbers Sum\n");
			
	        System.out.println("     Sum = "+counting);
	        
     }

}
