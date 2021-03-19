package com.class06;

import java.util.Scanner;

public class SwithExample {

	public static void main(String[] args) {

		/*
		 * @author: Lily King 
		 * 02/21/2021 
		 * Switch Program
		 */
		//identify favorite food
		//capture country
		//based on country identify favorite food
		//Italy=pasta
		//Russia=borsch
		//
		
		String country,food;
		

		System.out.println("\n\t\t\t Favorite Food");

		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter your country: ");
		country=input.nextLine();

		switch (country.toLowerCase()) {
		
		case ("usa"): 
			food="Burger";
		break;
		case ("afghanistan"): 
			food="Kebab";
		break;
		case ("vietnam"): 
			food="Pho";
		break;
		case ("poland"): 
			food="Pierogi";
		break;
		case ("kazakstan"): 
			food="Horse";
		break;
		case ("belarus"): 
			food="Draniki";
		break;
		case ("tajikistan"): 
			food="Plov";
		break;
		case ("mexico"): 
			food="Tacos";
		break;
default: food = "unkown";

		}
		
		System.out.println("Your favorite food is " +food);

	}
}
