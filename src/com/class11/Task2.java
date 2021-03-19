package com.class11;

public class Task2 {

	public static void main(String[] args) {
		//create 2d array where you will store the following values
		//Mr, Mrs, Ms, Miss,and Smith Jordan Jackson, Obama 
		//after storing values print, first and last name based on row 
		//w and row 2
		
		//create a 2d array that the first row will contain 4 names
		//2nd row will contain grades then your program
		//should print a and b grades
		
		System.out.println("______________Name Array______________\n");

		String[][]a = {
				{"Mr","Mrs","Ms","Miss"},//row 1 array
				{"Smith","Jordan","Jackson","Obama"},//row 2 array
		
				};
	
		
		System.out.println(a[0][0]+" "+a[1][0]+", "+a[0][1]+" "+a[1][2]
				+", "+a[0][2]+" "+a[1][2]+", "+a[0][3]+" "+a[1][3]);
		
System.out.println("______________Grade Array______________\n");
		

String[][]b = {
		{"Mr Smith","Mrs Jordan","Ms Jackson","Miss Obama"},//row 1 array
		{"A","B","C","D"},//row 2 array

		};


System.out.println(b[0][0]+" "+b[1][0]+"\n"+b[0][1]+" "+b[1][1]);
	}

}
