package com.example.objectOrientedPackage;

public class Student {
 int id;
 String name;
 int age;
 
 public Student(int i, String n) {
	id = i;
	name=n;
}
 
 public Student(int i, String n , int a) {
	id =i;
	name = n;
	age = a;
}
	void display() {
		System.out.println(id +" "+name + " " + age);
	}
}
