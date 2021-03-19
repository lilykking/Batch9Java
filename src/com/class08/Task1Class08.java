package com.class08;

import java.util.Scanner;

public class Task1Class08 {

	public static void main(String[] args) {
		// print numbers 1-50 except those divisible by 3

		System.out.println("\n\t\t\t\t________________Task 1________________\n");

		for (int a = 1; a <= 50; a++) {
			if (a % 3 == 0)
				continue;
			System.out.print(a + " ");

		}
		
		// create a program to ask user to apply for credit card
		// keep asking until answer is yes
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\t\t\t\t________________Task 2________________\n");
		
		String yes="yes";
		String no="no";
		
	while(!no.equalsIgnoreCase(yes)){ 
		System.out.println("Would you like to apply for a credit card?");
		no = scan.nextLine();
}
		
	}
}