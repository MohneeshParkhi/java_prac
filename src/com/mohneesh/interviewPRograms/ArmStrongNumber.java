package com.mohneesh.interviewPRograms;

import java.util.Scanner;

public class ArmStrongNumber {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			Integer input = scan.nextInt();
			
			scan.close();
			
			System.out.println("Entered number is : " + input);
			
			int num = input;
			int sumCube =0 ;
			int rem;
			while(input != 0) {
				rem = input%10;
				sumCube = sumCube+(rem * rem * rem);
				input = input/10;
			}
		
			if(sumCube == num) {
				System.out.println("Number is ArmStrong");
			}else {
				System.out.println("Number is not ArmsStrong");
			}
		
		}
		
		
}
