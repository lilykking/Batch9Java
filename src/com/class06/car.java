package com.class06;

import java.util.Scanner;

public class car {


	public static void main(String []args){
	//@Author: Lily King
	//@Date: 02/21/2021
	//@Program: Car Make

	String carOrigin = "null";
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your favorite car make");
	String car=scan.nextLine();

	switch(car)
	{case ("BMW"):
	carOrigin = "german car";
	break;
	case ("Toyota"):
	carOrigin = "japenese car";
	break;
	case ("Maserati"):
	carOrigin = "italian car";
	break;
	default: carOrigin = "unknown";}

	System.out.println("Your favorite car is "+carOrigin);


	
	}


}
