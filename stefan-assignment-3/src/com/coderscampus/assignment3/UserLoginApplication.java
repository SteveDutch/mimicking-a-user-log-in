package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService data = new UserService();

		Boolean loginSuccess = data.checkUserInput();
		if (loginSuccess == false) {
			System.out.println("\nToo many failed login attempts, you are now locked out.");
		}
	}

	// TODO close scanners -> not necessary regarding to 
	// https://stackoverflow.com/questions/54393770/fixing-java-util-nosuchelementexception-for-scanner
	static String inputMail() {
		System.out.println("\nEnter your email:\n");
		Scanner scanner = new Scanner(System.in);
		String inputMail = scanner.nextLine();
		return inputMail;
	}

	static String inputPassword() {
		System.out.println("\nEnter your password: \n");
		Scanner scanner = new Scanner(System.in);
		String inputtedPassword = scanner.nextLine();
		return inputtedPassword;
	}

}
