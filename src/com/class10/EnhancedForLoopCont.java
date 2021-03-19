package com.class10;

public class EnhancedForLoopCont {

	public static void main(String[] args) {
		//enhanced for loop
		//can only deincrement on enhanced for loop
		//can do deincrement using regular for loop
		
char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';

		
for(char grade:grades) {System.out.println(grade);}


System.out.println("");
boolean [] boo= {true,false,false,false,false,true};

for(boolean b : boo) 
	System.out.println(b);

System.out.println("");

//[]=indexes

System.out.println("\n\t________________ print mod ________________\n");


int []numbersa= {10,14,78,5,90,76};

for(int i=0;i<numbersa.length;i++) if(numbersa[i]%2==0) {


System.out.print(numbersa[i]+" ");
}
	}
}

