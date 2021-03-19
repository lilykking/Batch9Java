package com.class12;

public class Hw5 {

	public static void main(String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable?

		int[][]numbers= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300}
		};

		for(int first[]: numbers) 
		
		{System.out.println("");
		
		for(int second:first)
		
		{System.out.print(second+" ");
			}
		}

		System.out.println("\n\nNumber [2][2]: "+numbers[2][2]);		
				
		numbers[2][2]=500;
		
		System.out.println("New number [2][2]: "+ numbers[2][2]);
		
		
		///////
		
		int[][]numbers1= {
				{11,22,33,44},
				{100,200,300,400},
				{1000,2000,3000}
		};

		for(int first[]: numbers1) 
		
		{
		
		for(int second:first)
		
		{
			}
		}

		System.out.println("\n\nNumber [2][2]: "+numbers1[2][2]);		
				
		numbers[2][2]=500;
		
		System.out.println("New number [2][2]: "+ numbers1[2][2]);
	
		
		
		
		
		
	
	}

	}