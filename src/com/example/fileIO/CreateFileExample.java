package com.example.fileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileExample {

	public static void main(String[] args) {
		File file = new File("fileName.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter printW = new PrintWriter(file);
			printW.println("tHis is my file content ");
			printW.println(1000);
			printW.close();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
