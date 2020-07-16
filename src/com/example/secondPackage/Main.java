package com.example.secondPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyClass myInfo = new MyClass(10,"deepak",24,"i am a programmer");
//      System.out.println(myInfo);
      System.out.println(myInfo.toString1());
      MyClass asFundInfo = new MyClass(11, "as fund", 24, "he is a model");
      System.out.println(asFundInfo.toString1());
//      
//      myInfo.id =10;
//      myInfo.name = "deepak";
//      myInfo.age = 25;
//      myInfo.bio = " This is deepak and i am a programmer";
//      
//      System.out.println(myInfo.id + myInfo.name +myInfo.age + myInfo.bio);
//      
//      MyClass asFund = new MyClass();
//      asFund.id = 11 ;
//      asFund.name =" deepak yadav";
//      asFund.age =24;
//      asFund.bio ="i m fine";
//      
//      System.out.println(asFund.id +asFund.name+asFund.age+asFund.bio);
	}

};
