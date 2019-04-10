package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	void removeDuplicate(List<Integer> arr) {
		Object[] arrList = arr.toArray();
		
		
		for(int l = 0; l< arrList.length-1 ;l++ ) {
				if(arrList[l].equals(arrList[l+1])) {
								
				
				}
		}
	}
	
	
	public static void main(String[] args) {
		ArrayListExample arrayListExample = new ArrayListExample();
		
		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(6);
		int counter = 0;
	    
		 Object[] arr = list.toArray();
		 ArrayList ll = new ArrayList();
		 System.out.println(list);
		
		System.out.println("Counting number of repeated values");
		
		for(int i=0;i<arr.length-1 ;i++) {
			Integer k = (Integer)arr[i];
			Integer kk= (Integer)arr[i+1];
			if(k == kk ) {
				ll.add(k);
				counter++;
			}
		}
		
		System.out.println(counter);
		System.out.println("Repeated values");
		System.out.println(ll);
		
		System.out.println("Removing duplicate from array");
		arrayListExample.removeDuplicate(list);
		
	}
}
