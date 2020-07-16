/**
 * 
 */
package com.example.secondPackage;

/**
 * @author Deepak
 *
 */
public class MyClass {

  int id ;
  String name;
  int age;
  String bio;
  
  public MyClass(int id, String name, int age,String bio) {
	  this.id = id;
	  this.name= name;
	  this.age = age;
	  this.bio = bio;
  }

  public String toString1() {
	  return "my id" + id + "\n my name is"+ name +" this is my age "+ age +"this is my bio "+ bio;
  }
}
