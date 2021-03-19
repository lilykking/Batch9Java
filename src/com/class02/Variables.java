package com.class02;

public class Variables {

	public static void main(String[] args) {

		// Lily King 02/07/2021

		// create different variables to store student information
//change students name, combine values

		String first = "Lily";
		String last = "King";
		char A = 'A';
		char B = 'B';
		int phoneNumber = 703;
		String state = "VA";
		String city = "Arlington";

		String student = ("\n - My name is " + first + " " + last + "\n - I am an " + A + "/" + B + " student"
				+ "\n - I live in " + city + "," + state + "\n - And my phone number is: " + phoneNumber + "-"
				+ phoneNumber + "-" + "9999");

		System.out.println(student);

		first = "Bat";
		last = "man";
		city = "city";
		state = "Gotham";
		phoneNumber = 999;

		String batMan = ("\n\tMy new name is " + first + last + " and" + " I moved to " + state + ", " + city + "!"
				+ "\n\tmy new phone number is " + phoneNumber + "-" + phoneNumber + "-" + "9999.");

		System.out.println(batMan);

	}

}
