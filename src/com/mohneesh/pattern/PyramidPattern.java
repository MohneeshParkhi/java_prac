package com.mohneesh.pattern;

import java.util.Scanner;

public class PyramidPattern {
	
	void printRightHalfPyramid(String ch) {
		System.out.println("Entered Character is : \t"+ ch);
		
		for(int i=0;i<5;i++) {
			 for(int j=0 ;j<= i ;j++) {
				 System.out.print(ch);
			 }
			 System.out.println();
		}
	}
	
	void printRightPyramidSecLogic(String ch) {
	 
		// System.out.print("Entered character is \n:"+ ch);
		
		for(int i=5;i >=0;i--) {
			for(int j = 5; j>= i ;j--) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	
  public static void main(String[] args) {
	  PyramidPattern pattern = new PyramidPattern();
	  
	  System.out.println("Please enter * as charcter to print pyramids");
	  Scanner scan = new Scanner(System.in);
	  String c = scan.next();
	  pattern.printRightHalfPyramid(c);
	  pattern.printRightPyramidSecLogic(c);
  
  }
}
