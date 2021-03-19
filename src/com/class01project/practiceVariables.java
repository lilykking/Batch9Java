package com.class01project;

public class practiceVariables {

	public static void main(String[] args) {

		/*
		 * @author: Lily King 02/06/2021 Syntax Technologies SDET Primitive Variable
		 * Types
		 */

		// In the program listed below
		// I will be listing various
		// primitive data types

		// declaring data types

		byte pt = 10;
		short tp = 100;
		int gloves = 1000;
		long masks = 10000;
		float total = 10000.80f;
		double f = 10000.99;
		boolean discount = true;
		boolean no = false;
		char w = '*';
		char o = '$';

		// creating a story line to
		// illustrate use of data types

		System.out.println("\n\tOnce the pandemic hit I had to " + "go to the store to pick up various items.");
		System.out.println("\n  My grocery list was: ");

		System.out.println(("\n - ") + pt + (" paper towels"));
		System.out.println(("\n - ") + tp + (" rolls of toilet paper"));
		System.out.println(("\n - ") + gloves + (" pairs of gloves"));
		System.out.println(("\n - ") + masks + (" face masks"));
		System.out.printf("\n\tAt first I thought my total was $%.2f", total);
		System.out.printf(",but it was actually $%.2f", f);
		System.out.print(".");
		System.out.println("\n\nI asked the cashier if it was " + discount + (" that I'd get a discount") + o
				+ (", but she said ") + w + no + w + ("!"));

	}

}
