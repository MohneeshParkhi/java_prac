package com.mohneesh.interviewPRograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;import java.util.function.BiConsumer;

public class CountDuplicateChars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		char charInput[] = input.toCharArray();
		
		// ArrayList<E> list = new ArrayList();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		// int counter =0;
		for(int i=0;i< charInput.length;i++) {
			
			
			if(map.get(charInput[i]) != null){
				// counter = i;
				map.put(charInput[i],map.get(charInput[i])+1);	
			}else {
				map.put(charInput[i],1);
			}
		}
		// counter = 0;
		
		map.forEach(( k ,v) ->{
			System.out.print(k + "  "+v +"\n");
		});
	}
}
