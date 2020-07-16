package com.example.newObjectOrientedPackage;

public class SuperClassChild extends SuperKeyword{
  int speed = 100;
  void display() {
	  System.out.println(speed);// will print speed of SuperClassChild
	  System.out.println(super.speed);
  }
}
