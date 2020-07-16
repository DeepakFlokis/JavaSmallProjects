package com.example.firstPackage;
import java.util.Scanner;
public class LogicalOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your marks : ");
    int mark = scan.nextInt();
    
    if((mark >=80) && (mark <= 100)) {
    	System.out.println("well done .Keep it up");
    }
    else if((mark >60) && (mark <= 79)) {
    	System.out.println("need some improvement");
    }
    else {
    	System.out.println("you need to get out of the house ");
    }
	}

}
