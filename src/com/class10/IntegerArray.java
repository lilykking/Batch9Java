package com.class10;

public class IntegerArray {

		public static void main(String[] args) {


			
			//@Author:Lily King
			//@Date: 03/03/2021
			//@Program: int Array
			
			System.out.println("\n\t\t____________ HW 3 : Integer Sum Array ____________\n");
			
			int[] a=new int[6];
			a[0]=0;
			a[1]=1;
			a[2]=2;
			a[3]=3;
			a[4]=4;
			a[5]=5;
			
			System.out.print("\tThe integers are: ");
			
			for(int c: a) {System.out.print(c+", ");}
			
			int total = 0;
			
			for (int b=0;b<a.length;b++)  total+=a[b]; { 
			
			System.out.println("\n\n\tThe sum of the integers is: "+total);
			
					
			}

		}
		}
		



			

		

