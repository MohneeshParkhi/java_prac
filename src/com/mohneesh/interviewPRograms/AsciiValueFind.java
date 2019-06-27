package com.mohneesh.interviewPRograms;

import java.util.Scanner;

public class AsciiValueFind {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//System.out.println("Enter the number of letter of which AScii value need to find");
	
	// char []ch = new char[num];

	System.out.println("Enter the characters");
	
	String str = scan.nextLine();
	
	boolean []checkPangram = new boolean[26];
	
	char [] arr = str.toLowerCase().toCharArray();
	
	for(int i=0; i < arr.length;i++) {
		char c = arr[i];
		Integer iNum =(int) c;
		System.out.println(iNum-96);
		
	}
	
	for(int i=97 ;i<122 ;i++) {
		for(int j=0 ;j<arr.length;j++) {
			char c = arr[i];
			Integer iNum =(int)c;
			int kPos = iNum-96;
			
			if(iNum == i) {
				
				checkPangram[kPos]=true;
			}else {
				checkPangram[kPos] = false;
			}
		}
	}
	
	
	for(int h=0 ;h < 25 ;h++) {
	System.out.println(checkPangram[h]);
	}
	
	
}
}
