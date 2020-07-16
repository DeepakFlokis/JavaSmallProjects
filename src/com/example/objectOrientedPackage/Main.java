package com.example.objectOrientedPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	ThisKeyword tk = new ThisKeyword(1, "dyadav");
//	ThisKeyword tk1 = new ThisKeyword(2, "deepak1");
//	tk.display();
//	tk1.display(); 
		
	ThisKeyword thisK = new ThisKeyword();
	thisK.p();
		
     encapsulationClass myClass = new encapsulationClass();
     
     Student s1 = new Student(10, "john");
     Student s2 = new Student(11, "deepak", 28);
     //s1.display();
     //s2.display();
     
    StaticKeyword obj = new StaticKeyword();
    //obj.id = 10;
    // obj.skeyword1();
   // StaticKeyword.skeyword();
     
     
//     System.out.println(myClass.getId() + myClass.getName() + myClass.getAge() +myClass.getBio());
     
     myClass.setId(14);
     myClass.setName("rohan");
     myClass.setAge(24);
     myClass.setBio("he is a model");
     
//     System.out.println(myClass.getId() + myClass.getName() + myClass.getAge() +myClass.getBio());
     

 	constructorClass constr = new constructorClass();
 	//System.out.println(constr.average());
 	
 	constructorClass constr1 = new constructorClass(10,20,20);
 	//System.out.println(constr1.average());
 	
	}
  }
