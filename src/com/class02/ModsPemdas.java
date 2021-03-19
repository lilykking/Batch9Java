package com.class02;

public class ModsPemdas {
	public static void main (String [] args) {
		
		int num1 =10;
		int num2 =11;
		
		//numbers between strings become strings
		//numbers before strings can be added multiplied ect
		
		String S1 = "Hello";
		String S2 = "Hi";
		
		System.out.println(num1+S1+num2+S2);
		
		System.out.println(S1+S2+num1+num2);
		
		System.out.println(num1+num2+S1+S2);
		
		System.out.println(S1+S2+num1+num2);
		
		System.out.println(" "+S1+" "+num1+num2);
		
		String result = S1+S2+(num1+num2+9);

		System.out.println(result);
		
	
		
		

	}

}
