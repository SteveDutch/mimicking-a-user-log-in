package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsersData {
	
	private int count = 0;
	
	
	public UsersData() {
		System.out.println("Heia");
		
		BufferedReader fileReader = null;
		
		
		// read data file
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				count++;
				System.out.println(line);
			}
			/* not working
			 * User[] users = new User[count]; while ((line = fileReader.readLine()) !=
			 * null) { System.out.println("started users loop"); BufferedReader fileReader1;
			 * // try { fileReader1 = new BufferedReader(new FileReader("data.txt")); //
			 * String line = ""; line = fileReader1.readLine(); String[] tempArray =
			 * line.split(","); users[count] = new User(tempArray);
			 * System.out.println(line); }
			 */
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		} /*finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		//}
		User[] users = new User[count];
		  
		 // macht ein arrray nur mit der ersten zeile
		for (int i =0 ; i < count; i++) {
			System.out.println("started users loop"+i);
			BufferedReader fileReader1;
			try {
				fileReader1 = new BufferedReader(new FileReader("data.txt"));
				String line = "";
				line = fileReader1.readLine();
				String[] tempArray = line.split(",");
					users[i] = new User(tempArray);
					System.out.println(line);
				//}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(users);
		
	}
		 
	
	

}
}
		
	


