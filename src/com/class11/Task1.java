package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*Create array of double variables
		 *calculate sum of all stored variables
		 */

		
		Scanner scan = new Scanner(System.in);
		int size =0;
		Double [] array;
		Double sum = (double) 0;

		
		System.out.println("\nHow many values would you like to store? ");
		
 size = scan.nextInt();	
	
	array = new Double [size];
	
		for(int i=0; i<size; i++) { 
			
			System.out.println("Please enter a value: ");
			
			array[i] = scan.nextDouble();		
	}
		
		
for(Double variables : array)  { 

	sum+=variables;
}

System.out.println("\n_____ Your total value is _____\n");
System.out.println("The sum of " + size+" elements from the array = "+sum);
}
}