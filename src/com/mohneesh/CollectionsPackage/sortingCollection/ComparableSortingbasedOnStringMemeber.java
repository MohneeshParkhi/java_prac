package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.Collections;
import java.util.LinkedList;

class abc implements Comparable<abc>{
	String name;
	abc(String name){
		this.name= name;
		
	}
	
	@Override
	public int compareTo(abc obj) {
		
		return this.name.compareTo(obj.name);
	}
	
}



public class ComparableSortingbasedOnStringMemeber {
	public static void main(String[] args) {
	 
	 LinkedList<abc> list = new LinkedList<>();
	 
	 list.add(new abc("mohneesh"));
	 list.add(new abc("avneesh"));
	 list.add(new abc("naveesh"));
	 
	 Collections.sort(list);
	 
	 list.forEach((obj) ->{
		 System.out.println(obj.name);
	 });
		
	}
}
