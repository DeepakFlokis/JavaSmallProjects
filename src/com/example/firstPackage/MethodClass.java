package com.example.firstPackage;
import java.util.Scanner;
public class MethodClass {

	public static void main(String[] args) {
		double x,y,z;
		double avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three number :");
		x = scan.nextDouble();
		y = scan.nextDouble();
		z = scan.nextDouble();
		
		avg = average(x,y,z);
		System.out.println("the  average is = " + avg);
		// TODO Auto-generated method stub
//		myMethod();
		hello("deepak");
		int sum = addition(1,2,6);
		System.out.println(sum);
	}

//	public static void myMethod() {
//		System.out.println("this is my first method");
//	}
	public static double average(double num1, double num2, double num3) {
		double avg = (num1+num2+num3)/3 ;
		return avg;
	}
	
	
	
	public static void hello(String name) {
		System.out.println("hello" + name);
	}
	public static int addition(int x, int y, int z) {
		System.out.println("addition of these three numbers: " + (x+y+z));
		return (x+y+z);
	}
}
