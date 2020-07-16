package com.example.interfaceExample;

public class Main {

	public static void main(String[] args) {
		// A obj = new A();// cannot be intansiate because its an interface
		        Fun obj = new Fun();
		        A obj1 = new Fun();
		        obj.B();
		        obj1.C();
	}

}
