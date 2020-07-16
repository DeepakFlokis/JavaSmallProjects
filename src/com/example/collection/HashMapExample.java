package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {  
//	    Map map=new HashMap();  
//	    //Adding elements to map  
//	    map.put(1,"Amit");  
//	    map.put(5,"Rahul");  
//	    map.put(2,"Jai");  
//	    map.put(6,"Amit"); 
//	    map.put(6,"Amit1");
//	    //Traversing Map  
//	    System.out.println(map);
//	    System.out.println(map.entrySet());
//	    Set set=map.entrySet();//Converting to Set so that we can traverse  
//	    System.out.println(set);
//	    Iterator itr=set.iterator();  
//	    while(itr.hasNext()){  
//	        //Converting to Map.Entry so that we can get key and value separately  
//	        Map.Entry entry=(Map.Entry)itr.next();  
//	        System.out.println(entry.getKey()+" "+entry.getValue());  
//	    }  
		
		
		//------------------------------------------------------
		
//		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//		   map.put(1,"Mango");  //Put elements in Map  
//		   map.put(2,"Apple");    
//		   map.put(3,"Banana");   
//		   map.put(1,"Grapes"); //trying duplicate key  
//		       
//		   System.out.println("Iterating Hashmap...");  
//		   for(Map.Entry m : map.entrySet()){    
//		    System.out.println(m.getKey()+" "+m.getValue());    
//		   }  
		
		//---------------------------------------//----------------------------------------------------------------------//-----------------------------//------------
//		 HashMap<Integer,String> hm=new HashMap<Integer,String>();    
//		    System.out.println("Initial list of elements: "+hm);  
//		      hm.put(100,"Amit");    
//		      hm.put(101,"Vijay");    
//		      hm.put(102,"Rahul");   
//		       
//		      System.out.println("After invoking put() method ");  
//		      for(Map.Entry m:hm.entrySet()){    
//		       System.out.println(m.getKey()+" "+m.getValue());    
//		      }  
//		        
//		      hm.putIfAbsent(103, "Gaurav");  
//		      System.out.println("After invoking putIfAbsent() method ");  
//		      for(Map.Entry m:hm.entrySet()){    
//		           System.out.println(m.getKey()+" "+m.getValue());    
//		          }  
//		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
//		      map.put(104,"Ravi");  
//		      map.putAll(hm);  
//		      System.out.println("After invoking putAll() method ");  
//		      for(Map.Entry m:map.entrySet()){    
//		           System.out.println(m.getKey()+" "+m.getValue());    
//		          }  
		
		//--------------------------------------------------------------//--------------------------------------//-------------------------------//------------------
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(102, "Gaurav");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(101, "Vijay", "Ravi");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	     hm.replaceAll((k,v) -> "Ajay");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	}  
}
