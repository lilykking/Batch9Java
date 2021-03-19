package com.class08;

import java.util.Scanner;

public class SodaProgram {

	public static void main(String[] args) {
	
		
		//we need to make a user pay for a soda
		//keep asking user to pay you until it enters 3
		//if user gives more than 3 -> please give less money
		//if user gives less than 3 -> please give more money
		
Scanner scan = new Scanner(System.in);

int pay = 0;

System.out.println("Pay for soda: ");

while(pay !=3){

pay = scan.nextInt();

if(pay<3) {System.out.println("give me more money");}
else if
(pay>3){System.out.println("give me less money");}

}


System.out.println("Thank you.");
		
	}
}
	



