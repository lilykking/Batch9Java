package com.class12;

import java.util.Scanner;

public class GroupHWClass10 {

	public static void main(String[] args) {
		
		// If else statements are conditional statements that are also 
		// boolean expressions or expressions that evaluate to true or false.
		
	     //The “if” statement is used to execute a specific block of code,
		// given the condition is true

		//Using the “else if” statement after the “if”statement 
		//creates a new condition to be tested given the first if condition is false. 
		
		//You can use many different conditions in the else if statements
		//consecutively to create a list of conditions to be tested.

		//The “else” statement may be used after the if statement in order to execute 
		//a different block of code, given the original if statement condition is false 

		//An “if” statement is able to execute without an else statement

		//but an “else” statement must accompany an if statement in order to execute or exist.
		

		//if and if else statements are very useful and
	   //when needing to test conditions in code. 

      //For example : the "if" & the "if else"

		Scanner s = new Scanner(System.in);
	
		
		System.out.println("Is today Sunday?");
		
           boolean day = s.nextBoolean();
           {
	

		if(day==true){ 
			
			
			System.out.println("Awesome, we have Java Class.");
		}
		else { System.out.println("I wish we had Java Class.");}

	}
		
		
		
	
System.out.println("Is today Saturday, Sunday, or Monday? ");

		String day1 = s.nextLine();
		
	

		if(day1.equalsIgnoreCase("saturday"))
				
		{ System.out.println("Yay, we have Java Class.");}
		
		else if(day1.equalsIgnoreCase("sunday")) {

		 System.out.println("Awesome, we have Java Class.");}

		else if(day1.equalsIgnoreCase("monday")) { 
			
		System.out.println("I'm studying for Java Class.");}
		
		else{System.out.println("I wish we had Java Class.");}

		
		}
		
	}


