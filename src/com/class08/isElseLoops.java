package com.class08;

public class isElseLoops {

	public static void main(String[] args) {
		//for loops
		//with if else statements 
		int odd=0;
		int even =0;
		for(int a =1; a<=50; a+=2) {
			if(a%2==0) {even+=a;}
			
			else {odd+=a;}
			
			

		}
		System.out.println(even);
		System.out.println(odd);
	}



// I want to create a multiplication table
//1*1=1
//1*2=2
//1*3=3
//1*4=4
//
//1*10=10
	{
int num=1;
int mult;
for(int i=1;i<=10;i++)
{mult=num*i;
System.out.println(num+"*"+i+" = "+mult);}
}
}