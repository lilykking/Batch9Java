package com.class05;

import java.util.Scanner;

public class AverageScore {
	
	/*@author: Lily King
	 * 02/20/2021
	 * Commission Program
	 */
	//program to read input of 3 scores
	//quiz, midterm, and finaltest
	//determine grade based on following rules
	
	
	public static void main(String []args) {
	Scanner input;
input = new Scanner(System.in);

	double quiz,midterm,finalTest,total;

	
System.out.println("\n\t\t\tGrade Calculation Program");

System.out.println("\nPlease enter your quiz score: ");
quiz=input.nextDouble();

System.out.println("\nPlease enter your midterm score: ");
midterm=input.nextDouble();

System.out.println("\nPlease enter your final test score: ");
finalTest=input.nextDouble();

total = (quiz+midterm+finalTest)/3;
String grade=null;

if(total>=90) {
grade = "A";}
else if(total>80 && total>=70) {
grade = "B";}
else if(total>50 && total>=70) {
grade = "C";}
else {
grade = "F";}

System.out.printf("\nYour average test scores are %.2f",total);
System.out.printf("\n\nYour grade is "+ grade +".");
		

	
	}
}


	



