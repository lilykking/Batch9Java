package com.class10;

public class Animals {

	public static void main(String[] args) {


		
		//@Author:Lily King
		//@Date: 03/03/2021
		//@Program: Animal Array
		
		System.out.println("\n\t\t____________ HW 2 : Animal Array 2 Ways ____________\n");
		
		String[] a=new String[6];
		a[0]="lion";
		a[1]="tiger";
		a[2]="bear";
		a[3]="leopard";
		a[4]="jaguar";
		a[5]="elephant";
		
		System.out.print("For Loop Elements-----> ");
		
		for(int i=0;i<a.length;i++) {System.out.print(a[i]+", ");}
		
		System.out.print("\n\nEnhanced For Loop Elements---> ");		
		{
			for(String and:a) {System.out.print(and+ ", ");}		
		}

	}



		

	}

