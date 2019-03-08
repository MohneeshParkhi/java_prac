package com.mohneesh.staticExamples;

class UseCaseValue{
	static int i=10;
	static int j = 20;
	static void multiply() {
		System.out.println("multiplication is : "+ i*j);
	}
	
	void printSubtraction() {
		System.out.print(j-i);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
	  UseCaseValue.multiply();
	  UseCaseValue useOb = new UseCaseValue();
	  useOb.printSubtraction();
	}
}
