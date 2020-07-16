package com.example.firstPackage;
import java.util.Scanner;
public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
       double[] prices = new double[5];
       System.out.println("enter 5 values");
       prices[0] = scan.nextDouble();
       prices[1] = scan.nextDouble();
       prices[2] = scan.nextDouble();
       prices[3] = scan.nextDouble();
       prices[4] = scan.nextDouble();
      
       double total = prices[0] + prices[1]+prices[2]+prices[3]+prices[4];
       System.out.println("total values of all 5 items :" + total);
       System.out.printf("total values of all 5 items $%5.2f" , total);
	}

}
