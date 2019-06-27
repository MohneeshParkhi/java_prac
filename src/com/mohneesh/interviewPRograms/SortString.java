package com.mohneesh.interviewPRograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		char [] ar = input.toCharArray();
		
		Arrays.sort(ar);
		
	String sortedStr = new String(ar);
	
	System.out.println(sortedStr);
		
	}
}
