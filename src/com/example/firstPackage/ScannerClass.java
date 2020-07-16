package com.example.firstPackage;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x ,y ;
		System.out.println("enter your first value");
		x= s.nextInt();
		System.out.println("enter second value");
        y = s.nextInt();
        
//        int result = (x + y);
//        System.out.println("This is result :" + result);
      
        System.out.println("enter the operator");
        String operation = s.next();
        
        if(operation.equals("+")) {
        	System.out.println("this is the addidtion result " + (x + y));
        }
        else if(operation.equals("-")) {
        	System.out.println("this is the substraction result " + (x - y));
        }
        else if(operation.equals("*")) {
        	System.out.println("this is the multiplication result " + (x * y));
        }
        else if(operation.equals("/")) {
        	System.out.println("this is the division result " + (x / y));
        }
        else {
        	System.out.println("please enter the correct operation");
        }
	}

}
