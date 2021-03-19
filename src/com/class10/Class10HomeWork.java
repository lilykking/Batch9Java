package com.class10;

public class Class10HomeWork {

	public static void main(String[] args) {
		
		//@Author:Lily King
		//@Date: 03/03/2021
		//@Program: Car Array
		
		System.out.println("\n\t\t____________ HW 1 : Car Array 2 Ways ____________\n");
		
		String[] cars=new String[6];
		cars[0]="Tesla";
		cars[1]="BMW";
		cars[2]="Rolls Royce";
		cars[3]="Toyota";
		cars[4]="Lexus";
		cars[5]="Audi";
		
		
		System.out.print("For Loop Elements-----> ");
		
		for(int i=0;i<cars.length;i++) {System.out.print(cars[i]+", ");}
		
		System.out.print("\n\nEnhanced For Loop Elements---> ");		
		{
			for(String car:cars) {System.out.print(car+ ", ");}		
		

	}
}
	
}
		



