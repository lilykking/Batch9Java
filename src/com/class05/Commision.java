package com.class05;

import java.util.Scanner;

public class Commision {
	
	/*@author: Lily King
	 * 02/20/2021
	 * Commission Program
	 */
	//ask user to enter sale that he made
	//based in sales we will calculate commission:
	//if sale is between 10-100, commission = 10%
	//if sale is between 101-500, commission = 20%
	//if sale is between 501-1000, commission = 30%
	//if sale is more than 100, commission = 50%
	
	public static void main(String []args) {
	Scanner input;
input = new Scanner(System.in);

	double sale, commission, total;

	
System.out.println("\t\t\tCommision Calculation Program");

System.out.println("\nPlease enter your daily sale amount: ");
sale=input.nextDouble();

if(sale<10) {
System.out.println("Your daily commission is 0.");}

if(sale>=10 && sale<=100) {
commission = sale*0.1; total = commission + sale;}

else if(sale>=101 && sale<=500)
{commission = sale*0.2;total = commission + sale;}

else if(sale>=501 && sale<=1000)
{commission = sale*0.3;total = commission + sale;}

else
{commission = sale*0.5;total = commission + sale;}


System.out.printf("\nYour commission is $%.2f",commission);
System.out.printf(".");
System.out.printf("\n\nYour total earnings for the day is $%.2f",total);
		System.out.printf(".");
		
	if(commission>500) {System.out.println("\n\nYou are an amazing seller!");
	
	}
}
}

	

