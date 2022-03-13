package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService data = new UserService();
		System.out.println("back in main method " + data);
		
//		inputMail();
//		inputPassword();
		
		
//		System.out.println(inputPassword());
//		System.out.println("fini");
		Boolean loginSuccess = data.checkUserInput(/* inputMail(), inputPassword() */);
		 if  (loginSuccess == false) {
			 System.out.println("Too many failed login attempts, you are now locked out.");
		 }
	}
	// TODO close scanners
	static String inputMail() {
		System.out.println("Enter your email:\n");
		Scanner scanner = new Scanner(System.in);
		String inputMail = scanner.nextLine();
		System.out.println(inputMail);
		return inputMail;
	}
	
	static String inputPassword() {
		System.out.println("Enter your password: \n");
		Scanner scanner = new Scanner(System.in);
		String inputtedPassword = scanner.nextLine();
		//String inputtedPassword = null;
		return inputtedPassword;
	}
	

	

}
