package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add(i);
		}

		  Iterator<Integer> it = list.iterator();
		  
		  while(it.hasNext()) { Integer input = it.next(); //
		  System.out.println(input); 
		  }
		 
	}
}
