package com.example.handsOn;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
 // array can only hold premitive data type and having fixed size
// arrayList can hold any things and size can be anything according to requirement
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Australia");
        list.add("India");
        list.add("Nederlands");
        System.out.println(list);
        
        list.add("sydney");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
        
        String city = list.get(1);
        System.out.println(" the second city is "+ city);
        
        int pos = list.indexOf("India");
        System.out.println("India is at position " + pos);
        
	}

}
