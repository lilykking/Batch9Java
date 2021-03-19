package com.class08;

import java.util.Scanner;

public class PurchaseProgram {

	public static void main(String[] args) {
		// User monetary entries accumulate

		System.out.println("\n\t\t___________________Purchase Program___________________");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter item to purchase: ");
		String item = scan.nextLine();
		System.out.println("Enter item to price: $");
		double price = scan.nextDouble();
        double pay = 0;

    

		do {
			System.out.println("\nEnter payment: ");
			pay += scan.nextDouble();

			if (pay < price)

				{System.out.printf("\nYou owe $%.2f",(price-pay));
				System.out.println();
			
				}

			else if (pay > price)
				{System.out.printf("\nThank you for payment. Your change is $%.2f",(pay-price));}

			else
				{System.out.println("\nEnjoy your "+item+"! Thank you for shopping!");}

		} while (pay != price && pay < price);

	}
}
