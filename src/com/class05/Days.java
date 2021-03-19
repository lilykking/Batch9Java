package com.class05;

import java.util.Scanner;

public class Days {


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
	int day;
	String Weekday;
	
	
	input = new Scanner(System.in);
	
	System.out.println("\t\t\tDay of the Week Program");
	
System.out.println("\nPlease enter the day of the week: ");

Weekday=input.nextLine();


if(Weekday.equalsIgnoreCase("Monday")||Weekday.equalsIgnoreCase("Tuesday"))
{System.out.println("\nIt is a weekday.");}

else if(Weekday.equalsIgnoreCase("Wednesday")||Weekday.equalsIgnoreCase("Thursday")||Weekday.equalsIgnoreCase("Friday"))
{System.out.println("\nIt is a weekday.");}


else if(Weekday.equalsIgnoreCase("Saturday")||Weekday.equalsIgnoreCase("Sunday"))
{System.out.println("\nIt is a weekend.");}

else
{System.out.println("\n Invalid day.");}

}		
	
	}
	

