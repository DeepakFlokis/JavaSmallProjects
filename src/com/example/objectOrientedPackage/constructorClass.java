package com.example.objectOrientedPackage;

public class constructorClass {
 int x ;
 int y;
 int z;
 
 public int average() {
	 return (int)((x*y*z)/3);
 }
 
 public constructorClass() {
	  x =10;
	  y=20; 
	  z = 20;
	 System.out.println("this is my constructor");
}
 public constructorClass(int i, int j, int k){
	 x = i;
	 y = j;
	 z = k;
 }
}
