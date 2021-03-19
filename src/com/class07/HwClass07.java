package com.class07;

public class HwClass07 {
	
	//@Author: Lily King
	//@Date: 02/28/2021
	//@Program: Task 1 Class 07
	
	//Sum of Odd & Even numbers 1-50
	//Using Loops

	public static void main(String[] args) {
		
		
		System.out.println("\n\n\t________________________ Sum Of Odd Numbers 1 - 50 ________________________\n");
		
		int odd =0;
		for(int a=1; a<=50; a+=2) { odd=odd+a;
		}
		System.out.println("\t\t\t The sum of odd numbers 1 - 50 equals: "+odd);
		
	
		System.out.println("\n\n\t________________________ Sum Of Even Numbers 1 - 50 _______________________\n");
		
		int even =0;
		for(int b=0; b<=50; b+=2) { even=even+b;
		}
		System.out.println("\t\t\t The sum of even numbers 1 - 50 equals: "+even);

		System.out.println("\n\n\t\t_______________________ Final Total ______________________\n");
		System.out.println("\t\t The total sum of odd & even numbers 1 - 50 equals: "+(odd+even));
		}}
