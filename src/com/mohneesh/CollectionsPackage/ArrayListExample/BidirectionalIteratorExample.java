package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BidirectionalIteratorExample {
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("mohneesh");
		list.add("keep");
		list.add("it ");
		list.add("up");
		list.add("bro");
		
		ListIterator<String> lIterator = list.listIterator();
		
		 // forward iterating the list
		while(lIterator.hasNext()) {
			System.out.println(lIterator.next());
		}
		
		/*
		 * while(lIterator.hasNext()) { System.out.println(lIterator.next()); }
		 */
		
		
		while(lIterator.hasPrevious()) {
			System.out.println(lIterator.previous());
		}
		
	}
}
