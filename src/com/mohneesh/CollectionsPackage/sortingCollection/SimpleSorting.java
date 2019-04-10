package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleSorting {
 public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);  
	ArrayList<Integer> arrlist = new ArrayList<>();
	String c = input.next();
    int [] arr=null;
	char[] a = c.toCharArray();
	
	for(int k=0 ;k<a.length ;k++ ) {
		int i =  a[k];
		arrlist.add(i);	
	
	
	}
	
	System.out.println("Arranging keyword");
	
	
	for(int r = 0 ; r< arrlist.size();r++) {

		
	}
	
	System.out.println(arrlist);

	
	
}
}
