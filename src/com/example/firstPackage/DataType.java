package com.example.firstPackage;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String firstName = "deepak";
       char fName[] = {'d','e','e','p','a','k','y'};
       
       System.out.println(firstName);
       System.out.println(firstName.length());
       System.out.println(firstName.equals(fName));
       System.out.println(firstName.toUpperCase());
       System.out.println(fName);
       
       String myName = "Deepak Kumar";
       String myAge = "is";
       int myAgeis = 26;
       int  myGross = (int)28.66;
       double myGross1 = 28.666 ;
       System.out.println(myName + myAge + myAgeis);
       System.out.println(myGross);
       System.out.println(myGross1);
	}

}
