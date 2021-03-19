package com.class05;

import java.util.Scanner;

public class Height {

	/*@author: Lily King
	 * 02/20/2021
	 * Height Program 
	 */
	
	//create a program to prompt user 
	//height entry with the conditions
	//short = under 60 inches
	//medium = between 60-72 inches
	//tall = over 72 inches
	
	public static void main(String []args) {
	
		Scanner input;
	double height;
	
	input = new Scanner(System.in);
	
	System.out.println("\t\t\tHeight Program");
	
System.out.println("\nPlease enter your height in inches: ");
height=input.nextDouble();

if(height<=60)
{System.out.println("\nYou are short.");}

else if(height>60 && height<=72)
{System.out.println("\nYou are medium.");}

else if(height >72)
{System.out.println("\nYou are tall.");}

else
{System.out.println("\nYou are unknown.");}

}		
	
	}
	
	
	
