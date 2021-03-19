package com.class12;

import com.class10.Arrays;

public class arryList {

	public static void main(String[] args) {

/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		
		
		System.out.println("-----other way with ascending order------");
		
	
		int array[] = {11, 22, 90, 105, 966, 47,};
		
		Arrays.sort(array);
		
		
		System.out.println("Second largest number is "+array[array.length-2]);
		
		
		
		

	}

}
