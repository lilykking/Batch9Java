package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		
		/* We want to create an array that will store elements
		 * from a user.
		 * We will need to use scanner
		 */

		//declaring the array
		
		Scanner scan = new Scanner(System.in);
		String element;
		String [] array;

		
		System.out.println("\nHow many String elements would you like to store? ");
		
	int size = scan.nextInt();	
	
	array = new String[size];
	
		for(int i=0; i<size; i++) { 
			
			System.out.println("Please enter a String: ");
			
			array[i] = scan.next();	
		
	}
		
		System.out.println("\n_____ Let's see what we have stored _____\n");
		
for(String elements : array) {
		System.out.print(elements+", ");
}

}
}
