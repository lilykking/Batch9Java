package com.class10;

public class LoopArray {

	public static void main(String[] args) {
		String[] name=new String[9];

		System.out.println("\n______________Name Array______________\n");
				
				name[0]="Yovanna";
				name[1]="Ariana";
				name[2]="Alex";
				name[3]="Nelson";
				name[4]="Jonathan";
				name[5]="Sami";
				name[6]="Elizabeth";
				name[7]="Alex";
				name[8]="\n---> Java Binks <---";
				
				
				System.out.println(name[0]);

				String[] names = {"Yovanna","Ariana","Alex","Nelson","Jonnathan","Sami","Elizabeth"};

				System.out.println(names[2]);
				
		System.out.println("______________Word Array______________\n");

		String[] word=new String[6];

				
				word[0]="Saturday";
				word[1]="is";
				word[2]="Java";
				word[3]="coding";
				word[4]="day";
				word[5]=".";
				
				
				System.out.println(word[0]+" "+ word[1] +" "+word[2]+" "+word[3]+" "+word[4]+word[5]);
				
				
				String[] words = {"Saturday","is","Java","coding","day","."};
				
				System.out.println(words[0]+" "+ words[1] +" "+words[2]+" "+words[3]+" "+words[4]+words[5]);
			
				System.out.println("");
				
				for(int i=0; i<name.length;i++) {System.out.println(name[i]);
					
					
				}
				
				
				
				
			}


	}

