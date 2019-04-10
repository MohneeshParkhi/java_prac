package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorWorkingwithCollection {
	public static void main(String[] args) {
		ArrayList<Integer>  list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Stream<Integer> stream = list.stream();
		
		
		Spliterator<Integer> itr  = stream.spliterator();
		
		while(itr.tryAdvance((obj) ->{
			System.out.println(obj);
		}));
		
		
	}
}
