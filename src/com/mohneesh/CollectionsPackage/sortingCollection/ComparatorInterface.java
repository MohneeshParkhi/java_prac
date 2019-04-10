package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.Comparator;

class Studentt{
	int rollNum;
	String name;
	
	Studentt(int roll, String name){
		this.rollNum = roll;
		this.name = name;
	}
}


class RollNumberComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}

	
}


public class ComparatorInterface {
	public static void main(String[] args) {
		Studentt s , s1, s2;
		
		s= new Studentt(1,"Aman");
		s1 = new Studentt(2, "Mohneesh");
		s2 = new Studentt(3,"Avneesh");
		
		
		
	}
}
