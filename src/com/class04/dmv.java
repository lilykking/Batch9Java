package com.class04;

import java.util.Scanner;

public class dmv {
	public static void main(String []args) {
		
		/*@author: Lily King
		*02/19/2021
		*DMV Representative Program
		*/
		System.out.println("\t\t\tDMV License Program\n ");
Scanner sc=new Scanner(System.in);
//prompting user for their age
System.out.println("Enter your age: ");
int age = sc.nextInt();
//printing out eligibility for license
if(age>=18)
	{System.out.println("You are 18 years of age or older, so you will recieve a License.");}
else
{System.out.println("You are under the age of 18, would you like a Learner's Permit?");}
	}
}
