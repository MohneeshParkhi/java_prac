package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bike {
	String bikeName;
	
	Bike(String bName){
		bikeName = bName;
	}
}

class BikeComparator implements Comparator<Bike>{
	
	/*
	 * @Override public int compare(Object o1, Object o2) { Bike b = (Bike)o1; Bike
	 * b1 = (Bike) o2;
	 * 
	 * return b1.bikeName.compareTo(b1.bikeName); }
	 */

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return o1.bikeName.compareTo(o2.bikeName);
	}
}


public class StringComparator {
	public static void main(String[] args) {
		
		Bike b, b1, b2;
		
		b = new Bike("ijay");
		b1 = new Bike("sujuki");
		b2 = new Bike("a");
	
	   ArrayList<Bike> arr = new ArrayList<>();
	
	   arr.add(b);
	   arr.add(b1);
	   arr.add(b2);
	   
	   Collections.sort(arr, new BikeComparator());
     
	   arr.forEach((objBike) -> {
		   System.out.println(objBike.bikeName);
	   });
	
	}
}
