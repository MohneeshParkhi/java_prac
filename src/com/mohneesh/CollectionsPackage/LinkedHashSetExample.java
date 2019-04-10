package com.mohneesh.CollectionsPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

class  Book{
	int price;
	String author;
	
	Book(int p, String auth){
		price = p;
		author = auth;
	}
	
	void print() {
		System.out.println("Author Name \t:" + author);
		System.out.println("Price \t:"+price);
	}
}


public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Book> linkHashSet = new LinkedHashSet<>();
		LinkedHashSet<String> lin = new LinkedHashSet<String>();
		linkHashSet.add(new Book(10,"RD Sharma"));
		linkHashSet.add(new Book(20, "NCERT"));
		linkHashSet.add(new Book(30,"Science"));
		linkHashSet.add(new Book(40,"Maths"));
		linkHashSet.add(new Book(40,"Maths"));
		// linkHashSet.add(null);
		linkHashSet.add(new Book(50,"Social Science"));
		linkHashSet.add(new Book(50,"Social Science"));
		Iterator<Book> it = linkHashSet.iterator();
		
		lin.add("hello");
		lin.add("hello");
		lin.add(null);
		
		Iterator<String> itr = lin.iterator();
		
		while(it.hasNext()) {
			it.next().print();
			System.out.println();
		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
