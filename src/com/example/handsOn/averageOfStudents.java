package com.example.handsOn;

import java.util.Scanner;

public class averageOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int numStudents;
       double[] height;
       System.out.println("how many students  are in the class");
       numStudents = scan.nextInt();
       height = new double[numStudents];
       
      for(int i= 0; i< numStudents ;i++) {
    	  System.out.println("enter the heights");
    	  height[i]= scan.nextDouble();
      }
      
      double maxHeight = height[0];
      for(int i = 1;i < height.length;i++) {
    	  if(maxHeight < height[i]) {
    		  maxHeight = height[i];
    	  }
      }
      double total = 0;
      for(int i = 1;i < height.length;i++) {
    	  total += height[i];
      }
      System.out.println("The tallest student in the class is : " + maxHeight);
      System.out.printf(" the average height of the all the studentsis : %5.2f" , total/numStudents );
       
	}

}
