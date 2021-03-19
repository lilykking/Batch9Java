package com.class05;

import java.util.Scanner;

public class HeightRevisited {
/*@author: Lily King
		 * 02/20/2021
		 * Day of the Week Program
		 */
		//create a program to print whether
		//it is a week day or weekend
		//day 1- 5 = weekday
		//day 6-7 = weekend
		//other days = invalid day
		public static void main(String []args) {
		Scanner input;
	input = new Scanner(System.in);
		double height;
		
		String definition = null;
		
	System.out.println("\t\t\tHeight Program");
	
System.out.println("\nPlease enter your height in inches: ");
height=input.nextDouble();

if(height<=60) {
definition = "short";}

else if(height>60 && height<=72)
	{definition = "medium";}

else if(height >72)
	{definition = "tall";}

else
System.out.println("\nYou are unknown.");

System.out.println("You are a person who's height is "+ definition);

	}		
		
		}
		
	

