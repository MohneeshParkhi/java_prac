package com.mohneesh.CollectionsPackage.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
		public static void main(String[] args) {
			HashMap<Integer, String> map= new HashMap();
			
			map.put(1, "abc");
			map.put(2,"bcd");
			map.put(3,"cde");
			map.put(4,"def");
			map.put(5,"efg");

			
			Set<Integer> k =map.keySet();
			System.out.println(k);
			
			Set<?> kk = map.entrySet();
			
			System.out.println(kk);
			
			Iterator<?> it= kk.iterator();
			
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey());
				System.out.println(m.getValue());
			} 
			
		  map.forEach((key ,v) -> { 
			System.out.println(key);
			System.out.println(v);
		});
		  }
}
