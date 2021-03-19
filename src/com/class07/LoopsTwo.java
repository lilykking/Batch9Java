package com.class07;

import java.util.Scanner;

public class LoopsTwo {

	public static void main(String[] args) {
	//loops studying continued
		//I want to capture your name 5 times and say hello to you
		//I want to capture your name 5 times and say hello to you
		//while = first checks condtion
		//do allows condition to be false do always to execute one time 
		//while while will never get executed
		//do-while will execute before it checks condition, so thats why at 
		//least one statement will be executed
		
		
	Scanner s = new Scanner(System.in);
	
	int loopy = 1;
	
	while(loopy<2)
	
	{	System.out.println("Please enter your name:\n");
	
	String namey = s.nextLine();
	
	System.out.println("\n Hello "+namey);loopy++;}
	

	
		
		System.out.println("Please enter your name:\n");
		
		String name = s.nextLine();
		
		int loop = 6;
		
		while(loop>1)
		
		{System.out.println("Hello "+name);loop--;}
		
		//////

		System.out.println("Please enter your name:\n");
		
		String named = s.nextLine();

		
		int loopz = 1;
		
		while(loopz<5)
		
		{System.out.println("Hello "+named);loopz++;}
		

		System.out.println("\n \n \n New loops do While");
		
		int loo = 1;
		do {System.out.println("Hello");
		loo++;
		}while(loo<=5);
		
		
	
		

	}

}
