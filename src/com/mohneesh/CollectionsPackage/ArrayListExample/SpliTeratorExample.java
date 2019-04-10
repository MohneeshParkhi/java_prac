package com.mohneesh.CollectionsPackage.ArrayListExample;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliTeratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
	
	   for(int i=0;i<10 ;i++) {
		   arrList.add(i);
	   }
	   
	   System.out.println(arrList);
	   
	   
	   // obtaining the stream 
	   System.out.println("Obtaining stream on arraylist");
	   Stream<Integer> stream = arrList.stream();
	
	   // estimate the size of the spliterator
	   
	   // etting spliiterator on stream
	   Spliterator<Integer> spliterator = stream.spliterator();
	   
	   System.out.println("Spliterator calculating size : " + spliterator.estimateSize());
	   
	   System.out.println("Printing the Characteristics of Spliterator in integer form");
	   System.out.println(spliterator.characteristics());
	   
	   // getting exact size
	   System.out.println("Getting Exact size : " + spliterator.getExactSizeIfKnown());
	   
	   
	   // checking the hasCharacteristics of splititerator...
	   System.out.println("Checking the Characteristics : " + 
	   spliterator.hasCharacteristics(spliterator.characteristics()) );
	   
       System.out.println("*************************************************");	   
	   System.out.println("Printing characteristics of spliterator properties ");
	   
	   System.out.println("Concurrent Characteristics \t:" + spliterator.CONCURRENT);
	   System.out.println("Distinct Characteristics \t:" + spliterator.DISTINCT);
	   System.out.println("Immutable Characteristics \t:" + spliterator.IMMUTABLE);
	   System.out.println("NonNull Characteristics \t:" + spliterator.NONNULL);
	   System.out.println("Ordered Characteristics \t:" + spliterator.ORDERED);
	   System.out.println("Sized Characteristics \t:" + spliterator.SIZED);
	   System.out.println("Sorted Characteristics \t:" + spliterator.SORTED);
	   System.out.println("Subsized Characteristics \t:" + spliterator.SUBSIZED);
	   System.out.println("********************************************************");
	   
	   System.out.println("Getting content of ArrayList");
	   
	   
	   System.out.println("********************************************************");
	   
	   System.out.println("Spliting the iterator");

	   Spliterator<Integer> split =spliterator.trySplit();
	  
	   
	   
	   System.out.println("Listing elements using splited iterator");
	   
	   spliterator.forEachRemaining((object) ->{
		   System.out.println(object);
	   });
	   
	   
	   
	   
	   split.forEachRemaining((obj) -> {
		   System.out.println("Value is : \t" + obj);
	   });
	   
	}
}
