package com.mohneesh.CollectionsPackage.map;

import java.util.LinkedHashMap;

public class LinkedHashMapp {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkHashMap = new LinkedHashMap<>();
		
		linkHashMap.put(1,"key");
		linkHashMap.put(2,"jay");
		linkHashMap.put(3,"may");
		
		linkHashMap.forEach((k,v ) ->{
			
			System.out.println(k);
			System.out.println(v);
		});
	}
}
