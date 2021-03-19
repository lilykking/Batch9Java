package com.class06;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		/*
		 * @author: Lily King 
		 * 02/21/2021 
		 * Switch Grading Program
		 */
		//capture user grade
		//based on grade print statement
		String grade = "A";
		System.out.println("\n\t\t\tGrading Program");
		System.out.println("\nPlease enter your letter grade: ");
		Scanner scan = new Scanner(System.in);
		grade=scan.nextLine();
		switch(grade.toLowerCase())
		{ case "a":
			System.out.println("Excellent");
			break;
		case "b":
			System.out.println("Good");
			break;
		case "c":
			System.out.println("Average");
			break;
		case "d":
			System.out.println("Bad");
			break;
			default: System.out.println("Not acceptable."); }	
		}
}
