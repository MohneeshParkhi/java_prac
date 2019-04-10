package com.mohneesh.CollectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("ab");
		list.add("abc");
		list.add("abcd");
		list.add("abcde");
		
		System.out.println("Initial collection value "+ list);
		Collections.addAll(list,"servlet", "JSP");
		
		System.out.println("After adding extra values" + list);
	
	 String arr[] = {"Hello","World"};
	 
	   Collections.addAll(list,arr);
	
	   System.out.println("After adding the values" +  list);
		
	}
}
