package com.class08;

import java.util.Scanner;

public class Class08Task {

	public static void main(String[] args) {
		//Write a program that reads a range of integers 
		//(start and end point), provided by a user and 
		//then from that range prints the sum of 
		// even and odd integers.
		Scanner scan = new Scanner(System.in);
		System.out.println("\n _________Enter A Range OF Integers For "
				+ "Calculation Of Even & Odd Totals_________ ");
		
		System.out.println("\nEnter number 1: ");
		int a = scan.nextInt();
		System.out.println("Enter number 2: ");
		int b = scan.nextInt();
		int even =0;
		int odd = 0;
		
	for(int c=a; a<=b; a++) { if(a%2==0) { even+=a;
		
	} else {odd+=a;}
		
		}
	System.out.println("Sum of even integers is " + even);
	System.out.println("Sum of odd integers is " + odd);
}

	}


	


