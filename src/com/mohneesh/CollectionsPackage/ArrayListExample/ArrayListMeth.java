package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;

public class ArrayListMeth {
  public static void main(String[] args) {
	
	  ArrayList<Integer> arrayList = new ArrayList<Integer>();
	  
	  for(int i=0 ;i<10 ;i++) {
	  arrayList.add(i*2);}
	  
	  System.out.println("ArrayList values are as follows \n"+ arrayList);
	  System.out.println("Methods of ArrayList are as follows");
	  
	  System.out.println(arrayList.get(2));
	  
	  System.out.println(arrayList.size());
	  System.out.println(arrayList.remove(5));
	  System.out.println(arrayList.size());
	  // System.out.println(arrayList.trimToSize());
	  System.out.println(arrayList.removeIf((k) -> (k==4)));
	  
	  arrayList.set(5,1000);
	  System.out.println(arrayList);
	  
	  arrayList.retainAll(arrayList);
	  System.out.println(arrayList);
	  
}
}
