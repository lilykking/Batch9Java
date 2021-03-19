package com.class05;

import java.util.Scanner;

public class yearsworked {
	public static void main(String[] args) {

		/*
		 * @author: Lily King 02/19/2021 Worker Bonus Program
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t\t\tBonus Inquiry Program\n");
		// prompting user to input information
		System.out.println("Enter number of years worked: ");
		int years = sc.nextInt();
		System.out.println("Enter annual salary: $");
		double salary = sc.nextDouble();
		
		// establishing conditions for user bonus eligibility
		
		//if statement
		//else if statement
		//else statement
		
		if (years >= 5) {
			System.out.println("You are eligible for a bonus.");
		}
		if (salary > 50000 && years >= 5) {
			System.out.println("The bonus is $ 5,000.");
		} else if (salary < 50000 && years >= 5) {
			System.out.println("The bonus is $ 3,000.");
		}
		// printing user bonus status
		else {
			System.out.println("You are not eligible for a bonus.");
		}

	}
}
