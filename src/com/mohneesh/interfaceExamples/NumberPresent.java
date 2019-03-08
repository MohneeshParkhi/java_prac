package com.mohneesh.interfaceExamples;

/*
 * To check number is present and how many time present in array
 */
interface NumberArray{
	static void checkNumPresentAlgoOne(int number){
		// System.out.println(number);
		int num[] = {1,2,3,4,5,6,7};
		int i;
		int counter =0;
		for(i=0;i<num.length;i++) {
			if(num[i] == number) {
				counter++;
			}
		}
		System.out.print("Number is present "+ counter +" times.");
	}
} 

public class NumberPresent {
public static void main(String[] args) {
	int inputNum = 5;
	NumberArray.checkNumPresentAlgoOne(inputNum);
}
}
