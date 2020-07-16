package com.example.objectOrientedPackage;

public class ThisKeyword {
    int id;
    String name;
    
//    public ThisKeyword() {
//		System.out.println("Default constructor is invoked");
//	}
//    
//    public ThisKeyword(int id , String name) {
//    	this();// it is used to invoke current class constructor 
//		this.id = id;
//		this.name = name;
//	}
    
    void m() {
    	System.out.println("Method M is invoked");
    }
    
    void n() {
//    	m()
    	this.m(); // no need because compiler does it for me
    }
    
    void p() {
    	n();// compiler will add this to invoke as this.n()
    }
    
    void display() {
    	System.out.println(id+ " "+name);
    }
}
