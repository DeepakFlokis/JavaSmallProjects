package com.example.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListExample {

//	public static void main(String[] args) {
//		
//		List<Integer> myList = new ArrayList<Integer>();
//		myList.add(1);
//		myList.add(2);
//		myList.add(3);
//		myList.add(4);
//		myList.add(5);
//		myList.add(6);
//		
//		for(Integer itr : myList) {
//			System.out.println(itr);
//		}
//		System.out.println("Size :" + myList.size());
//		
//		myList.remove(2);// take index and delete
//		System.out.println(myList);
//		
//		myList.set(0, 74);
//		System.out.println(myList);
//		
//		//myList.clear();//clear the list
//		System.out.println(myList);
//		
//		Iterator<Integer> itr = myList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println(myList.get(1));
//	}
 
////////-------------------------------------------//////-------------------------------------------///////------------------------------//////------------
	 //public static void main(String args[]){  
//	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
//	      list.add("Mango");//Adding object in arraylist    
//	      list.add("Apple");    
//	      list.add("Banana");    
//	      list.add("Grapes");    
//	      //Printing the arraylist object 
//	      System.out.println(list);
//	   Collections.sort(list);
//	   System.out.println(list);
//	   Collections.reverse(list);
//	   System.out.println(list);
//	   
//	   Iterator<String> itr = list.iterator();
//	   while(itr.hasNext()) {
//		   System.out.println(itr.next());
//	   }
////////-------------------------------------------//////-------------------------------------------///////------------------------------//////------------  
//	   {  
//		   ArrayList<String> al=new ArrayList<String>();  
//		   al.add("Mango");  
//		   al.add("Apple");  
//		   al.add("Banana");  
//		   al.add("Grapes");  
//		   //accessing the element    
//		   System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
//		   //changing the element  
//		   al.set(1,"Dates");  
//		   //Traversing list  
//		   for(String fruit:al)    
//		     System.out.println(fruit);    
//		   
//		  }
	   
////////-------------------------------------------//////-------------------------------------------///////------------------------------//////------------  
	 //Creating a list of fruits  
//	   List<String> list1=new ArrayList<String>();  
//	   list1.add("Mango");  
//	   list1.add("Apple");  
//	   list1.add("Banana");  
//	   list1.add("Grapes");  
//	   //Sorting the list  
//	   Collections.sort(list1);  
//	    //Traversing list through the for-each loop  
//	   for(String fruit:list1)  
//	     System.out.println(fruit);  
//	       
//	  System.out.println("Sorting numbers...");  
//	   //Creating a list of numbers  
//	   List<Integer> list2=new ArrayList<Integer>();  
//	   list2.add(21);  
//	   list2.add(11);  
//	   list2.add(51);  
//	   list2.add(1);  
//	   //Sorting the list  
//	   Collections.sort(list2);  
//	    //Traversing list through the for-each loop  
//	   for(Integer number:list2)  
//	     System.out.println(number); 
		 
		 
//		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//         list.add("Ravi");//Adding object in arraylist  
//         list.add("Vijay");  
//         list.add("Ravi");  
//         list.add("Ajay");  
//          
//         System.out.println("Traversing list through List Iterator:");  
//         //Here, element iterates in reverse order  
//            ListIterator<String> list1=list.listIterator(list.size());  
//            while(list1.hasPrevious())  
//            {  
//                String str=list1.previous();  
//                System.out.println(str);  
//            }  
//      System.out.println("Traversing list through for loop:");  
//         for(int i=0;i<list.size();i++)  
//         {  
//          System.out.println(list.get(i));     
//         }  
//            
//      System.out.println("Traversing list through forEach() method:");  
//      //The forEach() method is a new feature, introduced in Java 8.  
//          list.forEach(a->{ //Here, we are using lambda expression  
//              System.out.println(a);  
//            });  
//              
//          System.out.println("Traversing list through forEachRemaining() method:");  
//            Iterator<String> itr=list.iterator();  
//            itr.forEachRemaining(a-> //Here, we are using lambda expression  
//            {  
//          System.out.println(a);  
//            });  
//}  
//	   
//	   
//	};
	 
////////-------------------------------------------//////-------------------------------------------///////------------------------------//////------------
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		           System.out.println("Initial list of elements: "+al);  
		           //Adding elements to the end of the list  
		           al.add("Ravi");  
		           al.add("Vijay");  
		           al.add("Ajay");  
		           System.out.println("After invoking add(E e) method: "+al);  
		           //Adding an element at the specific position  
		           al.add(1, "Gaurav");  
		           System.out.println("After invoking add(int index, E element) method: "+al);  
		           ArrayList<String> al2=new ArrayList<String>();  
		           al2.add("Sonoo");  
		           al2.add("Hanumat");  
		           //Adding second list elements to the first list  
		           al.addAll(al2);  
		           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
		           ArrayList<String> al3=new ArrayList<String>();  
		           al3.add("John");  
		           al3.add("Rahul");  
		           //Adding second list elements to the first list at specific position  
		           al.addAll(1, al3);  
		           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
		             
		 }
	}
	 

