package com.mohneesh.CollectionsPackage.LinkedListExample;

import java.util.LinkedList;

public class LinkedListMethodDemos {
	 public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Hello");
		list.add(1);
		list.add(45.23);
		
		list.addLast(55);
		list.addFirst(55);

		// adding at first position of list where pointer point
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.peek());
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("printing first element");
		// insert at first index or position of list
		System.out.println(list.offerFirst(78));
		
		System.out.println("Last Element");
		// insert at last position
		System.out.println(list.offerLast(799));
		
		
		System.out.println("Printing last element");
		// insert at last position
		System.out.println(list.offer("oops"));
		
		
		System.out.println("**********PRINTING ALL EMENENTS");
		
		list.forEach((ob)->{System.out.println(ob);});
		
		
		System.out.println("Removinga and fetching elements");
		
		  System.out.println(list.poll()); 
		  
		  System.out.println(list.pollFirst());
		  System.out.println(list.pollLast());
		 
	 }
}
