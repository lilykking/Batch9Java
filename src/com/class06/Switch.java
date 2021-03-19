package com.class06;

import java.util.Scanner;

public class Switch {
	
public static void main(String []args) {
	 /*
	 * @author: Lily King 
	 * 02/21/2021 
	 * Switch Program
	 */
	//store gender using M or F
	//F -> female otherwise unsure

	char gender = 'F';
	String description;
	

	System.out.println("\n\t\t\t Gender Program");

	Scanner entry = new Scanner(System.in);

	System.out.println("\nWhat is your gender? Enter \"M\" or \"F\".");
	gender=entry.next().charAt(0);

	switch (gender) {
	case ('M'): 
		description="Male";
	break;
	case ('F'): 
		description="Female";
	break;

		default: description="N/A";

	}
	
	System.out.println(description);

//Limitation:
	//switch cannot use Relational 
//or Logical Operators
	//switch is for string or variable 
	//but not logical or relationial operators
	//switch cannot be used with boolean, doubles
	
	boolean sunny=true;
	if(sunny) {System.out.println("I am happy");}
else { System.out.println("I am not happy");}
}
}



