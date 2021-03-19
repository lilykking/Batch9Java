package com.class05;

import java.util.Scanner;

public class credit {

	public static void main(String []args) {
		
		/*@author: Lily King
		*02/19/2021
		*Credit Inquiry Program
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t\tCredit Inquiry Program\n");
		//asking user whether or not they have a credit card
		System.out.println("Do you have a credit card? Enter yes or no.");
		String credit = sc.nextLine();
		if(credit.equals("yes"))
	{ System.out.println("What is the balance on the card?");
	int balance = sc.nextInt();
   if(balance<1000) {System.out.println("You need to pay of the card immediately, otherwise you can spend more.");}
		
	}
		if(credit.equals("no"))
		{ System.out.println("Would you like to sign up for a Credit Card?");
	String creditCard = sc.nextLine();
	  }

}
}
