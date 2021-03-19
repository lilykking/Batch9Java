package com.class10;

import java.util.Scanner;

public class Arrayrepl {

    //@Author: Lily King
	  //@Date: 03/05/2021
	  //@Program: Week String Array 
	  public static void main(String[] args)
	  {
String a [] = new String[] {" "," "," "," "," "," "," "};
		  
	  
	Scanner scan = new Scanner(System.in);
	String day ="null";

	for(int weekday = 1;weekday<=7; weekday++){
    System.out.println("Please enter day "+weekday+" of the week");

day = scan.nextLine();

	if(weekday==1){a[0]=day;}
	else if(weekday==2){a[1]=day;}
	else if(weekday==3){a[2]=day;}
	else if(weekday==4){a[3]=day;}
	else if(weekday==5){a[4]=day;}
	else if(weekday==6){a[5]=day;}
	else if(weekday==7){a[6]=day;}
	
	
	}
	for(String s : a){ System.out.println(s); 
	
	}
}
}

	
	 
	


	  



	  

