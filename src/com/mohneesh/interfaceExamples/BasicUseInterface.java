package com.mohneesh.interfaceExamples;


interface abstractionExample{
	void writeNameOnConsole();
	
}

interface printSum{
	void printSumNumbers();
}


public class BasicUseInterface implements abstractionExample, printSum{
    

	
	public static void main(String[] args) {
		// creating a reference variable and pointing to heap memory
		BasicUseInterface  basicUse = new BasicUseInterface();		
		basicUse.printSumNumbers();
		basicUse.writeNameOnConsole();
	}

	@Override
	public void printSumNumbers() {
		// TODO Auto-generated method stub
		System.out.println("Hey i am printing on sum");
		
	}

	@Override
	public void writeNameOnConsole() {
	System.out.println("writing on console");
		
	}

}
