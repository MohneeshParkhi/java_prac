package com.mohneesh.CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

class Bike{
	
	private String name;
	private String price;
	private String model;
	
	public Bike(String name, String price, String model) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
	}
	
	void printBikeDetails() {
		System.out.println("Bike name: \t"+ name);
		System.out.println("Price of bike: \t"+ price);
		System.out.println("Model of Bike: \t"+ model);
		
	}
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Bike b0 = new Bike("Yamaha","1 Lakh","2019");
		Bike b1 = new Bike("Yamaha","1 Lakh","2018");
		Bike b2 = new Bike("Yamaha","1 Lakh","2017");
		Bike b3 = new Bike("Yamaha","1 Lakh","2016");
		
		HashSet<Bike> hashSet = new HashSet<>();
		
		System.out.println("Performing operations on HashSet");
		
		hashSet.add(b0);
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(b3);
		
		HashSet<Bike> k=  (HashSet)hashSet.clone();
		
		System.out.println("Printing shallow copy of HashSet Using iterator");
	    Iterator<Bike> itr = k.iterator();
	    
	    while(itr.hasNext()) {
	    	//itr.next().printBikeDetails();
	       System.out.print("\t"+itr.next().hashCode());
	    }
	    
	    Iterator<Bike> i = hashSet.iterator();
	    
	    System.out.println("\n Printing original hashset using iterator \n");
	    while(i.hasNext()) {
	    	//i.next().printBikeDetails();
	    	System.out.print("\t"+i.next().hashCode());
	    }
	}
}
