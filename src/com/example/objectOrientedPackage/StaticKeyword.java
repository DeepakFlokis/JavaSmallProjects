package com.example.objectOrientedPackage;

public class StaticKeyword {
	static int id = 5;
	static String name = "deepak";
    public static void skeyword() {
    	System.out.println("This is a static method called by class name ");
    	System.out.println(id + name);
    }
    public void skeyword1() {
    	System.out.println("This is a non static method called by object");
    	id = 6;
    	System.out.println(id + name);
    }
}
