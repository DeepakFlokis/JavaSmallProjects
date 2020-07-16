package com.example.abstractExample;

public class Main {

	public static void main(String[] args) {
		//PrintInfo pi = new PrintInfo();//can not instatntiate the abstract class
		getPrintInfo1 gpi = new getPrintInfo1();
		gpi.getInfo1();
		gpi.getInfo();

	}
}
 abstract class PrintInfo{
	 abstract void getInfo() ;// we can provide any body to abstract method
	 
	 void getInfo1() {
		 System.out.println("hello i am not abstract method but i m allowed here");
	 }
 }
 
 class getPrintInfo1 extends PrintInfo{

	@Override
	void getInfo() {
		System.out.println("hello i am getInfo");
	}
	 
 }

