package com.class04;

import java.util.Scanner;

public class temp {

	public static void main(String []args) {
		
		/*@author: Lily King
		*02/19/2021
		*Temperature Conversion Program
		*/		
Scanner sc=new Scanner(System.in);
//prompting user for city and temperature
System.out.println("\n\t\t\tFahrenheit to Celcius\n");
System.out.println("Enter your city: ");
String city = sc.nextLine();
System.out.println("Enter the Fahrenheit temperature: ");
double temp = sc.nextDouble();
//formula to convert temperature
double celcius = (temp-32)*5/9;
//printing result of Fahrenheit to Celcius temperature in the city
System.out.printf("The temperature in the city is "+temp+" degrees Fahrenheit and %.4f",celcius);
System.out.print(" degrees celcius.");



}
}
