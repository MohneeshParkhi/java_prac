package com.mohneesh.CollectionsPackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> obj = new TreeSet<>();
	
		for(int i=0 ;i<10 ;i++)
		{
			obj.add(i);
		}
		//obj.add(null);
		System.out.println("Printing values using iterator");
		
		Iterator<Integer> itr = obj.iterator();
		
		while(itr.hasNext()) {System.out.println(itr.next());}
		
		System.out.println("Performing operation using other method");
		
		System.out.println(obj.clone());
		System.out.println(obj.first());
		System.out.println(obj.last());
		System.out.println(obj.headSet(5));
		System.out.println(obj.headSet(5, true));
		System.out.println(obj.subSet(5, 6));
		System.out.println(obj.pollFirst());
		System.out.println(obj.pollLast());
		System.out.println(obj);
		System.out.println(obj.lower(2));
		System.out.println(obj.higher(6));
		System.out.println(obj.headSet(5));
		System.out.println(obj);
	}
}
