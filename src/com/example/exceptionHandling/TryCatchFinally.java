package com.example.exceptionHandling;

//The finally block always executes when the try block exists.
//This ensures that the finally block is executed even if an unexpected exception occurs
public class TryCatchFinally {
   public static int retInt() {
	int a = 100;
	try {
		//a = a/0;
		return a;
	} catch (ArithmeticException e) {
		System.out.println("catch called");
		System.out.println(e);
		return a;
	}
	finally {
		//a = 500;
		System.out.println("finally called");
		System.out.println("hello i m here");
		//return a;
	}
}
	public static void main(String[] args) {
		System.out.println(retInt());
//		try {
//			//int  a=100/0;
//			System.exit(1);// it will be exit from program
//		} catch (ArithmeticException e) {
//			System.out.println("catch called");
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally called");
//		}

	}

}
