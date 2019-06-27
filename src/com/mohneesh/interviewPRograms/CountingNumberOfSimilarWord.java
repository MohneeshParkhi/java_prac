package com.mohneesh.interviewPRograms;

import java.util.HashMap;

public class CountingNumberOfSimilarWord {
	public static void main(String[] args) {
		
		String input = "Hi Hi hello my Name Name ";
		
		String split [] =input.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// System.out.println("Printing the string list");
		for(int i=0;i < split.length;i++) {
			//System.out.println(split[i]);
		
			if(map.get(split[i]) != null)
			map.put(split[i],map.get(split[i])+1);
			else
				map.put(split[i],1);
		}
		
		  System.out.println("Printing unique words with number of repetitions\n");
		  System.out.println("Words" + "    "+ "Repetition time"+ "\n");
		  
		  map.forEach((key, value) -> {
			  
			  System.out.println(key + " \t "+ value+"\n");
		  });
		
	}
}
