package com.class07;

public class Task01Class07 {
	
	//@Author: Lily King
	//@Date: 02/28/2021
	//@Program: Task 1 Class 07

	public static void main(String []args) {
		
		System.out.println("\n\t\t\t\t\t____________________ Tasks ____________________ \n");
		System.out.println("\n\t\t\t\t\t\t Numbers 1-100 in 1 line with space \n");
		
		int a = 1;
		while (a<=100) 
		{System.out.print(a+", "); a++;}
		
		System.out.println("\n\n\t\t\t\t\t\t Numbers 100-1\n");
		
		int b = 100;
		while (b>=1) 
		{System.out.print(b+", "); b--;}
		
	System.out.println("\n\n\t\t\t\t\t\tEven Numbers from 20 - 100\n");
		
		int c = 20;
		while(c<=40) 
		{System.out.print(c+", ");c+=2;}
		
		System.out.println("\n\n\t\t\t\t\t\tEven Numbers from 20 - 1 (Method 1)\n");
		
		int d=20;
		while(d>=1) 
		{System.out.print(d+", ");d-=2;}
		
		
	System.out.println("\n\n\t\t\t\t\t\tEven Numbers from 20 - 1 (Method 2)\n");
	
	for(int e=20; e>=1; e--) 
		
	{if(e%2==0)
	{System.out.print(e+", ");}
	}
		
System.out.println("\n\n\t\t\t\t\t\tOdd Numbers from 20 - 50 (Method 1)\n");
		
int f=49;
while(f>=20) 
{System.out.print(f+", ");f-=2;}
		
		System.out.println("\n\n\t\t\t\t\t\tOdd Numbers from 20 - 50 (Method 2)\n");
		
		for(int g=49; g>=20; g--) 
			
		{if(g%2==1)
		{System.out.print(g+", ");}
		}
			

	}
}
