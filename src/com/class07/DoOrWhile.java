package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
	
		//
		//lets say we played lottery
		//we have a win number/magic number 17
		//we have number 1-100
		//we will continue asking user to enter a number 
		//until user enters a valid number
		//Program will keep asking user until 
		//correct number is entered 
		
		//Loops
		
		Scanner scan = new Scanner(System.in);
		
		int num=17;
		
		do {
		System.out.println("Please enter any number for lottery:");
		num = scan.nextInt();}
		while (num!=17);
		System.out.println("Congrats you entered the lucky number "+num);
	//////////////////
		
		int num1=1;
		int lottery=17;
		
		while(num1!=lottery) {
		System.out.println("Please enter any number for lottery:");
		num1 = scan.nextInt();}
		System.out.println("Congrats you entered the lucky number "+num1);


	}

}
