package com.example.firstPackage;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(" the average of three integers is: " + average(3,7,9));
      System.out.printf(" the average of three integers is: %5.3f " , average(4.0,5.9,6.5));
	}
   public static double average(int x , int y, int z) {
	   return (x+y+z)/3.0 ;
   }
   public static double average (double x , double y , double z) {
	   return (x+y+z)/3;
   }
}
