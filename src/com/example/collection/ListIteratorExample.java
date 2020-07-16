package com.example.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("deepak");
		names.add("dee");
		names.add("deepa");
		names.add("deepak123");
		
		ListIterator<String> itr = names.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		System.out.println("");System.out.println("");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
