package com.class06;

import java.util.Scanner;

public class booLean {

	public static void main(String []args) {
		
		/*@author: Lily King
		 * 02/21/2021
		 * Price Program
		 */
		
		//calculate for final price after discount
		//check if sale -> no sale = not going shopping
		//yes sale -> we will ask the item, we will ask the price
		//if price is less than 10 apply 5% discount
		//if price between 10 & 100 apply 10% discount
		//if price is between 100-500 apply 20% discount
		//if price is more than 500 apply 30%
			
			Boolean sale=true;
			String item=null;
			Double price = 0.0;
			Double discount = 0.0;
			Double cost = 0.0;
		
		
			System.out.println("\n\t\t\t Sale Calculation Program");
			
			// if statement
			// else if statement
			// else statement
			
			Scanner entry = new Scanner(System.in);

			System.out.println("\nIs there a sale? Answer true or false.");
			sale=entry.nextBoolean();
			
			if(!sale)
		 {System.out.println("I am not going shopping.");}
			
			else 
			{System.out.println("What is the item on sale?");
			item=entry.next();}
			{System.out.println("What is the price of the item? $");
			price=entry.nextDouble();}
			
			if(price>0 && price >10)
			{discount = .05;}
			if(price >=10 && price<=100)
			{discount = .10;}
			else if(price >=100 && price<=500)
			{discount = .20;}
			else if(price >500)
			{discount = .30;}
	
			cost = price +(price*discount);
		
System.out.printf(" - Your item purchased was "+item);
System.out.printf("\n - Your original price was $%.2f", price);
System.out.printf("\n - Your discount is %.2f", discount);
System.out.printf("\n - Your final price is $%.2f",cost);
	
	
	}
}


