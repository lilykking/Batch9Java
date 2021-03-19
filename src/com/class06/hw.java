package com.class06;
import java.util.Scanner; 

public class hw {
	
	 //@Author: Lily King
	 //@Date: 02/21/2021
	 //@Program: Boolean Drinks 

	public static void main(String []args){
		
		boolean thirsty=true;
		boolean sleepy=true;
		String drink=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy=scan.nextBoolean();



		if((thirsty==true) && (!(sleepy)))
		{drink="water";}

		else if(thirsty==true && sleepy==true)
		{drink="coffee";}

		else if((!(thirsty)) &&(sleepy==true))
		{drink="tea";}

		else
		{drink="nothing";}

		System.out.println("Looks like you need to drink "+drink);
		}
		
}
