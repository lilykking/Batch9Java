package com.class11;

public class NumArray {

	public static void main(String[] args) {
	
		int[][]numbers= { 
				
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7}
				//inside of my 2d array i have an array of ints
	};
		
		System.out.println(numbers.length);//length of total array
		System.out.println(numbers[1].length);//length of 2nd array
		//nested loop to retrieve all of the values
		
		for(int row=0; row<numbers.length; row++) {
			System.out.println("");
			for(int col=0; col<numbers[row].length;col++) {
				
				System.out.print(numbers[row][col]+" ");
		}
		}System.out.println("\n---------------");	
		
		for(int[]array: numbers) {for(int a: array) 
		
		{System.out.print(a+" ");}
		System.out.println();
	}
	}
}
