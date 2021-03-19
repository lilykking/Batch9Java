package com.class07;

public class Loops {
	
	//@Author: Lily King
	//@Date: 02/28/2021
	//@Program: Different Types Of Loops

	public static void main(String[] args) {
		
//types of loops in java
		//while
		//do while
		//for
		//enhanced loop
		//advanced/enhanced for loop or for each loops
		//loops are good for reducing redundancy
		//loops are good for saving time 
		//++ & -- can stop loops 
		System.out.println("---------------------FOR LOOP---------------------");
		
		int time =17;
		if(time<12) {
			System.out.println("Hello");//code executes one time
		}
		
		System.out.println("--------------------WHILE LOOP--------------------");
		//introducing a counter variable to control the loop
		while(time<12) //while executes a block of code 
			//while the condition is true
			//code will run infinitely, because 11 will always
			//be less than 12
			//the "++" will add the statement of code one at a time
			//until statement loops to meet the integer number
			{System.out.println("Hello");
			time--;}
		//if int time = 7; and while(time<12) with
		//time --; code will execute infinitely because
		System.out.println("Print numbers 1-10");
		
		int num=1;
		//using the integer in the statement
		//gives you a direct increment
		while(num<11) {	System.out.println(num);
		num++;
		}
		int nume=20;
		//using the integer in the statement
		//gives you a direct increment\
		//remove println to print to remove lines
		//add + " " to create space
		//prints out 20-40
		while(nume<=40) {	System.out.print(nume+" ");
		nume++;
			
		}
		System.out.println();
		int numee=10;
		//using the integer in the statement
		//gives you a direct increment
		//remove println to print to remove lines
		//add + " " to create space
		//prints out 9  8 7 6  5 4 3 2 1
		while(numee>=1) {	System.out.print(numee+" ");
		numee--;
			
		}
		
		
		System.out.println("\n\t\t\t\t\t\t\t Numbers 1-100 in 1 line with space \n");
		
		int a = 1;
		while (a<=100) 
		{System.out.print(a+", "); a++;}
		
		System.out.println("\n\n\t\t\t\t\t\t\t Numbers 100-1\n");
		
		int b = 100;
		while (b>=1) 
		{System.out.print(b+", "); b--;}
		
	System.out.println("\n\n\t\t\t\t\t\t\t Even Numbers from 20 - 100\n");
		
		int c = 20;
		while(c<=40) 
		{System.out.print(c+", ");c+=2;}
		//mixing while and if statement

		System.out.println("\n------------------------------------------");
		
int d=20;
while(d<=30) {
if(d%2==0) {System.out.print(d+" ");}
d++;}
	}
}
