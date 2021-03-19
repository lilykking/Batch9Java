package com.class04;

import java.util.Scanner;

public class loans {
	public static void main(String []args) {
		
		/*@author: Lily King
		*02/19/2021
		*Loan Specialist Program
		*/
Scanner sc=new Scanner(System.in);
//prompting user for loan amount
System.out.println("\t\t\tLoan Specialist Calculation\n");
System.out.println("What is the loan amount needed?");
int loan = sc.nextInt();
if(loan<=200000)
{System.out.println("You will recieve a loan.");}
else {System.out.println("Loan is rejected.");}
		
	}

}
