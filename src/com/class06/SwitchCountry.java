package com.class06;

import java.util.Scanner;

public class SwitchCountry {

	public static void main(String[] args) {

		/*
		 * @author: Lily King 
		 * 02/21/2021 
		 * Switch Country Language Program
		 */
		//capture user country
		//based on country identify language
	
		String language,country;
		System.out.println("\n\t\t\t Spoken Language");
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter your country: ");
		country=input.nextLine();
		switch (country.toLowerCase()) {
		case ("united states"): 
			
			language ="English";
		break;
		case ("vietnam"): 
			language ="Vietnamese";
		break;
		case ("mexico"): 
			language ="Spanish";
		break;
		case ("russia"): 
			language ="Russian";
		break;
		case ("china"): 
			language ="Mandarin/Chinese";
		break;
		case ("france"): 
			language ="French";
		break;
		case ("brazil"): 
			language ="Portuguese";
		break;
		case ("portugal"): 
			language ="Portuguese";
		break;		
default: language = "unkown";
		}
			System.out.println("Your country's language is " +language);

	}
}

