package com.class08;

public class ContinueKeyboard {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {System.out.println("Hello");
			if(i==3) {
				continue;
			}
		System.out.println("I'm inside the loop");
		
		//print numbers 1-10 except 5&6
		//break = breaks the loop
		//continue = skips the current iteration/execution code goes back to beginning
		
		for(i=1;i<=10;i++) { 
			
			if(i==5||i==6) {
			continue;
		}
		System.out.println(i + " ");
			}
		System.out.println("---------------------------");
		
		//print all numbers 1-40 except numbers divisible by 4
		
		for(int g=1;g<=40;g++)
		{if(g%4==0) {continue;
			
		}
		System.out.println(g+" ");
		}
		}
	}
}
	


