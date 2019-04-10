package com.mohneesh.CollectionsPackage;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEXample {
 public static void main(String[] args) {
	Map<Integer,String> table = new Hashtable<>();
	
	String arr[] = {"mohneesh","India","America","China","Russia"};
	
	
	for(int i=0;i<5;i++) {
			table.put(i, arr[i]);
		}
	System.out.println("Priting values of Hashtable Iteratively");
	
	Set<?> s = table.entrySet();
	
	Iterator it = s.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	System.out.println("String representation of hashtable"+table.toString());
	
	// remapping the value of hashmap using compute method
	
	table.compute(3,(key, val) -> {
		return val.substring(3,5); 
	});
	
	Set itr = table.entrySet();
	
	Iterator i = itr.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}