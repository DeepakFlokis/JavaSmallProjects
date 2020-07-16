package com.example.collection;
import java.util.*;
public class hashSetExample {

	public static void main(String[] args) {
	
		HashSet<String> name = new HashSet<String>();
		name.add("depak");
		name.add("deepak1");
		name.add("deepak");
		name.add("depak");
  
		name.remove("depak");
		System.out.println(name);
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
