package com.class11;

public class Arrays2D {

	public static void main(String[] args) {
		//arrays can have multiple dimensions
		//2Dimensional array is an array of arrays
		//a combination of rows and columns
		
		
		//3=rows [3][4]
		//4=columns[3][4]
		
		int[][]num= new int [3][4];
		
		//1st array/1st row
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
//2nd array or 2nd row
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		//3rd array or 3rd row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		//for(int a: num) {
		
		System.out.println(num[1][3]);
		System.out.println("_______________Another way of "
				+ "creating an array_______________\n");
		
		int[][]numbers= {
				{1,2,3,4},//row 1 array
				{10,20,30,40},//row 2 array
				{100,200,300},//row 3 array
				};
		
		System.out.println(numbers[0][2]);
		
		
		System.out.println(numbers[1][1]);
		
		System.out.println(numbers[1][2]+numbers[0][3]);
		
		int sum = (numbers[1][2]+numbers[0][3]);
		
		System.out.println(sum);
		
		numbers[2][2]=500;
		
		System.out.println(numbers[2][2]);
		
		}
		

	}


