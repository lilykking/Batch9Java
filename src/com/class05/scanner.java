package com.class05;

import java.util.Scanner;

public class scanner {
	public static void main (String [] args) {
		
/* @author: Lily King 
 * 02/20/2021
 * 
 */		
		
		Scanner anyVariableName;
		anyVariableName =new Scanner(System.in);
		
		//capture sentence
		String sentence=anyVariableName.nextLine();
		
		//capture number
	   int num=anyVariableName.nextInt();
	   
		//capture double
	   double d=anyVariableName.nextDouble();
	   
	 //capture single character
	   char singleCharacter=anyVariableName.next().charAt(0);
	   System.out.println(singleCharacter);
		
		
		
		
		
		
	}
}
