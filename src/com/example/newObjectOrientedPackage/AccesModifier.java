package com.example.newObjectOrientedPackage;

public class AccesModifier {
	// if no modifier then java will add DEFAULT modifier implicitly
	// DEFAULT --> class, with in package , 
//	Access Modifier	within class	within package	outside package by subclass only	outside package
//	Private	               Y	         N	              N	                N
//	Default				   Y             Y                N                 N
//	Protected  	 	 	   Y             Y                Y                 N
//	Public	               Y             Y                Y                 Y
     
	 private int id;
     private String name;
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
     
}
