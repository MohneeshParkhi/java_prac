package com.mohneesh.interviewPRograms;

import java.util.Scanner;

public class AsciiValueFind {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//System.out.println("Enter the number of letter of which AScii value need to find");
	
	// char []ch = new char[num];

	System.out.println("Enter the characters");
	
	String str = scan.nextLine();
	
	char []checkPangram = new char[26];
	
	char [] arr = str.toLowerCase().toCharArray();
	
	for(int i=0; i < arr.length;i++) {
		char c = arr[i];
		Integer iNum =(int) c;
		System.out.println(iNum);
	}
	
	
	
	
}
}
