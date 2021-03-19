package com.class06;

import java.util.Scanner;

public class switchStatements {

	public static void main(String[] args) {

		/*
		 * @author: Lily King 02/21/2021 Switch Program
		 */

		int day = 1;
		String weekDay =null;

		System.out.println("\n\t\t\t Day of the Week Program");

		Scanner entry = new Scanner(System.in);

		System.out.println("\nWhat number day of the week is it?");
		day=entry.nextInt();

		switch (day) {//is value based
		case (1): {
			weekDay = "Monday";
			break;
		}
	
		case 2: {
			weekDay = "Tuesday";
			break;
		}
		

		case 3: {
			weekDay = "Wednesday";
			break;
		}
		
		case 4: {
			weekDay = "Thursday";
			break;
		}
	
		
		case 5: {
			weekDay = "Friday";
			break;
		}
	
		case 6: {
			weekDay = "Saturday";
			break;
		}
			
		case 7: {
			weekDay = "Sunday";
			break;
		}
		
			
			default: System.out.println("Weekday is invalid.");

		}
		
		System.out.println("\nIt is "+ weekDay +"!");

	}
}
