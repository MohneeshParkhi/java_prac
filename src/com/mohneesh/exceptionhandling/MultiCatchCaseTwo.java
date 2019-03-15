package com.mohneesh.exceptionhandling;

// Code to show that only one time one exception is thrown while executing the code.

class ExceptionOneThrown{
	int a[] = new int[5];
	
	void printValue() {
	 a[0]=10;
	 a[1] = 10/0;
	 System.out.println(a[0]);
	 System.out.println(a[1]);
	 System.out.println(a[10]);
	}
	
	void printAgain() {
		System.out.println(a[10]);
	}
}

public class MultiCatchCaseTwo {
	public static void main(String[] args) {
	
		ExceptionOneThrown on = new ExceptionOneThrown();
		try {on.printValue();}catch(ArithmeticException ae) {
			System.out.println(ae);
		}catch(IndexOutOfBoundsException io) {System.out.println(io);}
		try {
			on.printAgain();
			}
		catch(IndexOutOfBoundsException io) {
			System.out.println(io);
		}
	}
}
