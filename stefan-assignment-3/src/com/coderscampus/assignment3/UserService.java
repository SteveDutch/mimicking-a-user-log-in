package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	private int count = 0;
	User[] users;
	public UserService() {
		System.out.println("Heia");
		
		BufferedReader fileReader = null;
		
		
		// read data file, get number of lines, so the array can be initialized in the right size
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				count++;
				System.out.println(" counting number of lines "+ line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		users = new User[count];
		int count2 = -1;  
		// read data into Array of User objects
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line = "";
			
			while ((line = fileReader.readLine()) != null) {
				count2++;
				String[] tempArray = line.split(",");
				users[count2] = new User(tempArray);
				System.out.println("reading in file data / users  " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O Exception");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(users[0].getName());
		System.out.println(users[1].getPassword());
		System.out.println(users[2].getUsername());
		System.out.println(users[3].getName());
		
		// macht ein arrray nur mit der ersten zeile
		/*
		 * for (int i =0 ; i < count; i++) { System.out.println("started users loop"+i);
		 * BufferedReader fileReader1; try { fileReader1 = new BufferedReader(new
		 * FileReader("data.txt")); String line = ""; line = fileReader1.readLine();
		 * String[] tempArray = line.split(","); users[i] = new User(tempArray);
		 * System.out.println(line); //} } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * System.out.println(users);
		 * 
		 * }
		 */

	}

	boolean checkUserInput(/* String email, String password */) {
		System.out.println("ja, prüfschleife");
		int failedTrial = 0;
		for (int i = 1; i < 6; i++) { //Versuchsschleife
			failedTrial++;
			if (failedTrial > 5) {return false;};
			String email = UserLoginApplication.inputMail();
			
			for (int k= 0; k < count; k++) { //Schleife zum Prüfen der Eingabe
				
				if (email.equalsIgnoreCase(users[k].getUsername()) == true) {
					String password = UserLoginApplication.inputPassword();
					for (int j= 0; j < count; j++) {
							if (password.equals(users[k].getPassword()) == true) {
								System.out.println("Welcome: " + users[k].getName());
								return true;
							}						
					}  // failedTrial++;
				} 
					/*
					 * else { System.out.println("Invalid login, please try again") ;
					 * 
					 * }
					 */
				
		} System.out.println("Invalid login, please try again") ;
		//return false;
		
	}
		return false;

}
}
		
	


