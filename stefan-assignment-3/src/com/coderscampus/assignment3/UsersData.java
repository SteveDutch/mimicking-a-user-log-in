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
		//int[] test = new int[count-1];
		
		// read data file
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				count++;
				System.out.println(line);
				
				
				
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
	}
	int[] test = new int[count];

	}

