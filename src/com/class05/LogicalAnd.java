package com.class05;

public class LogicalAnd {
	public static void main(String []args) {
		/*@author: Lily King
		 * 02/20/2021
		 */
		
		//we have to identify if a number is small, medium, large, xlarge
		//if number between 1 and 10 = small
		//11 and 100 = medium
		//101 and 1000 = large
		//1001-100000 = xlarge
		
		//Logical operators
		
		//AND(&&)
		//true && true = true
		//true &&false = false
		//false && false = false
		//false && true = false 
		
		//OR(||)
		//true || true = true
		//true || false = true
		//false || true = false 
		//false || false = false
		
		int num=0;
		
		if (num<1)
			
		{System.out.println("Number is 0 or negative");}
		
		else if (num>=1 && num <=10)
		{System.out.println(num + " is a small number");
		}

		else if (num>=11 && num <=100)
		{System.out.println(num + " is a medium number");
		}

		else if (num>=101 && num <=1000)
		{System.out.println(num + " is a large number");}
		

		else if (num>=1001 && num <=100000)
		{System.out.println(num + " is a xlarge number");
		
		}
		else 
		{System.out.println(num + " is a huge number");
		}
		
		
		
	}

}
