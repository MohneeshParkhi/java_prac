package com.mohneesh.interviewPRograms;

import java.util.Scanner;

public class ReverseString {

	private String reverseWithoutApi(String input) {
		String reverseStr="";
		for(int i=input.length()-1 ; i >=0 ;i--) {
			 
			char ch = input.charAt(i);
			reverseStr = reverseStr + ch;
			
		}
		return reverseStr;
	}
	
	private StringBuffer reverseUsingStringApi(String input) {
		StringBuffer strBuff = new StringBuffer(input);
		
		StringBuffer reversedStr = strBuff.reverse();
		
		return reversedStr; 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		ReverseString reverseString = new ReverseString();
		
		System.out.println("Reversing a string  using String api");
		System.out.println(reverseString.reverseUsingStringApi(input));
		
		System.out.println("Reversing a string without using String api");
		System.out.println(reverseString.reverseWithoutApi(input));
		
		scan.close();
	
	}
}
