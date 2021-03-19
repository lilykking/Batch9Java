package com.class10;

public class arrays3 {

	public static void main(String[] args) {
	//another way of creating an array
char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		//another way of creating an array
		
		char[] grade = {'A','B','C','D','E','F','G','H'};
		
		//char[] grades1;
		//grades1=[];---> wont work
		
		System.out.println(grade[7]);
		System.out.println("number of elements in 2nd array is " +grade.length);
		
		//nameOfelementarray.length
		//to count number of elements of array
		
		
	}

}
