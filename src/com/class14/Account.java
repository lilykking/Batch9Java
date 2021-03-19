package com.class14;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;

	public void login(String passedUserNameWhenLogging,String passedPasswordWhenLogging) {
		
		if(userName.equals("Yulia")&&password.equals("pass123"))
			
		{System.out.println("Welcome to Bank of Ameria, your balance is "+balance);}
	}
	

public void printInfo() {
	
	if(isLoggedIn) {System.out.println("Your account number is "+
	accountNumber+"\nYour balance is "+balance);}
	
}
	
	
}