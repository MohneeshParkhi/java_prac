package com.mohneesh.interviewPRograms;

import java.util.LinkedList;

public class PrintStringLastWord {
	
	static void usingJavaMethFetchLastWord(String input) {
		String [] arr = input.split(" ");
		
		System.out.println(arr.length);
		
		System.out.println(arr[4]);
	}
	
	static void usingLogic(String str) {
		System.out.println("Passed String "+ str);
		char[] arr = str.toCharArray();
		String space = " ";
		char spp[] = new char[26];
		char sp = space.charAt(0);
		int j =0;
		for(int i=arr.length-1;i> 0;i--) {
				if(arr[i] != sp ) {
					spp[j]= arr[i];
				 j++;
				}
		       if(arr[i] == sp)break;
		}
		System.out.println("Last word is : ");
		for(int k=0 ;k< spp.length;k++) {
			System.out.print(spp[k]);
		}
//		for(int k=(spp.length-1) ;k>=0;k--) {
//			System.out.print(spp[k]);
//		}
	}
	
public static void main(String[] args) {
	String input = "Hey there! how r u!";
	// LinkedList<String> list = new LinkedList();
		/*
		 * int len = input.length(); for(int i=0;i< len ;i++) { if(input.matches(" ")) {
		 * list.add(); } }
		 */
	usingJavaMethFetchLastWord(input);
		usingLogic("Hello how are you!");
	}
}
