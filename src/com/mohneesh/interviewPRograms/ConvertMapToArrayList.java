package com.mohneesh.interviewPRograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToArrayList {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("h",1);
		map.put("he",2);
		map.put("hel",3);
		
//		map.forEach((k,v) -> {
//			System.out.println(k+" "+v);
//		});
		
		
		 
		 
		 
		Set<Entry<String, Integer>> set = map.entrySet();
		
		ArrayList arr = new ArrayList<>(set);
		arr.forEach((obj) -> {
			System.out.println(obj);
		});
		
		System.out.println("KeySet values are as follows\n");
	
		Set s = map.keySet();
		
		new ArrayList(s).forEach(obj ->{
			System.out.print("\t "+ obj);
		});;
		
		System.out.println();
		 Collection<Integer> collection = map.values();
	
		 collection.forEach((obj) -> {
			 System.out.println(obj); 
		 });
	}
	}

