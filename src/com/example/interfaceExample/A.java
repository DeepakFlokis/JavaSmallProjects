package com.example.interfaceExample;

 // interface is reference type in java;
// interface is similar to a class and it is a collenction of abstract method 
// we have to implement it 

public interface A {
   void B();
   void C();
   void D();
   
   // we can provide body to the method inside interface if the method is default or static method;
   static void test1() {
	  //body
	   System.out.println(" hello Youtube");
   };
   default void test2() {
	   //body
   }
}
