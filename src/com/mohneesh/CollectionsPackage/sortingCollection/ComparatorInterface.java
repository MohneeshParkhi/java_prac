package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Studentt{
	int rollNum;
	String name;
	
	Studentt(int roll, String name){
		this.rollNum = roll;
		this.name = name;
	}
}


class RollNumberComparator implements Comparator<Studentt> {
	
	@Override
	public int compare(Studentt o1, Studentt o2) {
		
		
		if(o1.rollNum == o2.rollNum) 
			return 0;
		else if(o1.rollNum > o2.rollNum)
			return 1;
		else return -1;
	}

	
}

class NameComparator implements Comparator<Studentt> {
	
	@Override
	public int compare(Studentt o1, Studentt o2) {
		return o1.name.compareTo(o2.name);
		
	}
}

public class ComparatorInterface {
	public static void main(String[] args) {
		Studentt s , s1, s2;
		RollNumberComparator  rolObj = new RollNumberComparator();
		LinkedList<Studentt> list = new LinkedList();
		s= new Studentt(1,"Vijay");
		s1 = new Studentt(2, "Ajay");
		s2 = new Studentt(3,"Jai");
		list.add(s);
		list.add(s1);
		list.add(s2);
		// rolObj.compare(s, s2);
	    Collections.sort(list, rolObj);
	    
	    
	    // sorting on the basis of rollNumber...
	    System.out.println("Sorting on the basis of RollNumber");
	    list.forEach((obj) -> {
	    	
	    	System.out.println(obj.rollNum+ obj.name);
	    });
		
	    // sorting on the basis of name
	    System.out.println("Sorting on the basis of Name");
	    
	    NameComparator name = new NameComparator();
	    
	    Collections.sort(list, name);
	    list.forEach((obj) -> {
	    	
	    	System.out.println(obj.rollNum+ obj.name);
	    });
		
	
	}
}
