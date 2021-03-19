package com.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * @author: Lily King 
		 * 02/21/2021 
		 * Calculator Program
		 */
		//capture 2 numbers from user
		//capture operator from user
		//based on operator provide result of integers
		
		Scanner scan=new Scanner(System.in);
		
		double a,b,total=0;
		String operator;
		
		System.out.println("\n\t\t\tCalculation Program");
		System.out.println("\nEnter your first number: ");
		a=scan.nextDouble();
		System.out.println("\nEnter your second number: ");
		b=scan.nextDouble();
        System.out.println("\nEnter one of the following operators (+,-,/,%,*): ");
        operator=scan.next();
        
        if(operator.equals("+"))
        {total=a+b;}
        else if(operator.equals("-"))
        {total=a-b;}
        else if(operator.equals("/"))
        {total=a/b;}
        else if(operator.equals("%"))
        {total=a%b;}
        else if(operator.equals("*"))
        {total=a*b;}
        else {System.out.println("Invalid.");}
        
         System.out.println("Result: "+total);
	}

}
