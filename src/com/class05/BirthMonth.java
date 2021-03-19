package com.class05;

import java.util.Scanner;

public class BirthMonth {
	
	
	/*@author: Lily King
	 * 02/20/2021
	 * Commission Program
	 */
	//Program to enter users birth month
	//program will produce a printed statement
	//introducing the season the person was born in
	
	public static void main(String []args) {
	Scanner input;
input = new Scanner(System.in);

	String month= null;
	String season = null;

	
System.out.println("\t\t\t\nBirth Season Calculation Program");

System.out.println("\nPlease enter the name of your birth month: ");
month=input.nextLine();

if((month.equalsIgnoreCase("January")) || month.equalsIgnoreCase("Feburary") ||
		month.equalsIgnoreCase("December"))

{season="Winter";}

else if((month.equalsIgnoreCase("March")) || month.equalsIgnoreCase("April") || 
		month.equalsIgnoreCase("May"))
{season="Spring";}

else if((month.equalsIgnoreCase("June")) || month.equalsIgnoreCase("July") ||
		month.equalsIgnoreCase("August"))
{season="Summer";}

else if((month.equalsIgnoreCase("September")) || month.equalsIgnoreCase("October") ||
		month.equalsIgnoreCase("November"))
{season="Fall";}

else {System.out.println("Entry Invalid.");}

	System.out.println("\nYour birth season is "+season);
	}

	



}
