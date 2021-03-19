package com.class05;

import java.util.Scanner;

public class LargestDouble {

	public static void main(String []args) {
	
	/*@author: Lily King
	 * 02/20/2021
	 * Largest of 3 Doubles
	 */
	
	//create a program to find the largest of 3 doubles
	//use if else statement
		
		double a,b,c;
		String score=null;
		
		System.out.println("\n\t\t\t Highest Score Program");
		
		Scanner entry = new Scanner(System.in);

		System.out.println("Enter score 1:");
		a=entry.nextDouble();
	
		System.out.println("Enter score 2:");
		b=entry.nextDouble();

		System.out.println("Enter score 3:");
		c=entry.nextDouble();
		
		if(a>b && a>c)
		{score=String.valueOf(a);}
		else if(b>a && b>c)
		{score=String.valueOf(b);}
		else if(c>a && c>b)
		{score=String.valueOf(c);}
		else if(a==b && a==c && b==c)
		{score=String.valueOf(a);
			System.out.println("All the scores are equal.");}
       else if(a==b && a>c)
		{score=String.valueOf(a);}
       else if(c==b && c>a)
		{score=String.valueOf(c);}
       else if(a==c && a>b)
     		{score=String.valueOf(a);}
		
		else {System.out.println("Invalid entry.");}
		
	System.out.println("\n"+score + " is the highest score.");
		
}
}
