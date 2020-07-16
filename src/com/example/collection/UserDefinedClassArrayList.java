package com.example.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1=new Student(101,"Sonoo",23);  
		 Student s2=new Student(102,"Ravi",21);  
		 Student s3=new Student(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
	
	
//	ArrayList<String> al1=new ArrayList<String>();  
//    al1.add("Ravi");    
//    al1.add("Vijay");    
//    al1.add("Ajay");    
//      
//    try  
//    {  
//        //Serialization  
//        FileOutputStream fos=new FileOutputStream("file");  
//        ObjectOutputStream oos=new ObjectOutputStream(fos);  
//        oos.writeObject(al1);  
//        fos.close();  
//        oos.close();  
//        //Deserialization  
//        FileInputStream fis=new FileInputStream("file");  
//        ObjectInputStream ois=new ObjectInputStream(fis);  
//      ArrayList  list=(ArrayList)ois.readObject();  
//      System.out.println(list);    
//    }catch(Exception e)  
//    {  
//        System.out.println(e);  
//    }  
 }  

};

class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}
