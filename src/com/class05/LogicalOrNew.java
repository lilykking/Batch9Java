package com.class05;

import java.util.Scanner;

public class LogicalOrNew {

	/*@author: Lily King
	 * 02/20/2021
	 */
	
	//ask user to enter age
	//if age = 1 - 3 = baby
	//if age = 3 - 5 = bigger baby
	//if age = 5-12 = you are a kid
	//if age = 13-19 = teenager
	//if age is above 20 = you are an adult
	
	public static void main(String []args) {
	
		Scanner input;
		String name;
	int age;
	
	input = new Scanner(System.in);
	
System.out.println("Please enter your name");
name=input.next();

System.out.println("Please enter your age");
age=input.nextInt();

if(age>=1 && age <3)
{System.out.println("you are a baby");}

else if(age >=3 && age <5)
{System.out.println("you are a bigger baby");}

else if(age >=5 && age <=12)
{System.out.println("you are a kid");}

else if(age >=13 && age <19)
{System.out.println("you are a teenager");}

else if(age>=20)
{System.out.println("you are an adult");}

else {System.out.println("you are not born yet");}

}		
	
	}
