package com.mohneesh.pattern;

public class LeftHarfPyramid {
	public static void main(String[] args) {
		String ch = "*";
		
		for(int i=0;i<=5;i++) {
			System.out.print(" ");
			for(int j=5;j >=0; j--) {
				System.out.print(ch);	
			}
			System.out.println();
		}
	}
}
