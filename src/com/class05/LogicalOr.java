package com.class05;

public class LogicalOr {

	public static void main(String []args) {
		
		/*@author: Lily King
		 * 02/20/2021
		 */
		
		//variable day
		//if day is tuesday or wednesday = maual class
		//if day mon or fri = no class
		//if day is sat or sun = java class
		//if day is thurs = review class
		
		String day = "Saturday";
		
		if(day.equals("Monday") ||day.equals("Friday"))
		{System.out.println("Today I have no class");}
		
		else if
	(day.equals("Tuesday")||day.equals("Wednesday"))
		{System.out.println("Today I have no class");}
		
		else if 
		(day.equals("Thursday"))
		{System.out.println("Today I have no class");}
		
		else if 
	(day.equals("Saturday") || day.equals("Sunday"))
		{System.out.println("Today I have JAVA class");}
		
		else {System.out.println(day + " is invalid");
	}
	
}
}