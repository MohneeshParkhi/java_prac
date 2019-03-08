package com.mohneesh.AbstractClassExamples;


abstract class PrintMsg{
	void printSum() {
		int i = 2;
		int j = 6;
		System.out.println("Sum is :"+ (i+j));
	}
	abstract void printMultiplication();
}


public class AbstractClassFirstExample extends PrintMsg{
	
	@Override
	void printMultiplication() {
	int k = 2; int j = 3;
	System.out.println("Multiplication is :" + (2*3));
	}
	
	public static void main(String [] args) {
		AbstractClassFirstExample obj = new AbstractClassFirstExample();
		obj.printSum();
		obj.printMultiplication();
	}
	
	@Override
	void printSum() {
	 System.out.println("Overriding a method defintion in abstract class");
	}
	
}
