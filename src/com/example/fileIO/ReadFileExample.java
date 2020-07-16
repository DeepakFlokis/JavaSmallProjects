package com.example.fileIO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		
		FileReader flr;
		BufferedReader bfr = null;
		try {
			flr = new FileReader("fileName.txt");
			 bfr = new BufferedReader(flr);
			String line;
			while((line= bfr.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bfr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

}
