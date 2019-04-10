package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ChangeCollectionUsingListIterator {
	public static void main(String[] args) {
List <String> list = new ArrayList<>();
		
		list.add("mohneesh");
		list.add("keep");
		list.add("it ");
		list.add("up");
		list.add("bro");
		
		System.out.println("List size before adding to ArrayList \t"+list.size());
		ListIterator<String> lIterator = list.listIterator();
		lIterator.add("Yo yo new element ");
		
		
		System.out.println("After addding to the List \t" + list.size());
		
		lIterator = list.listIterator();
		
		
		while(lIterator.hasNext()) {
			System.out.println(lIterator.next());
		}
		
		lIterator.set("happy new version to you");
		
		System.out.println("after using set method");
		
		System.out.println(list);
		
	}
}
