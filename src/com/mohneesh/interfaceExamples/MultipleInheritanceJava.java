package com.mohneesh.interfaceExamples;


interface One{
	 void printMessage(); 
}

interface two{
	void printSomething();
}

public class MultipleInheritanceJava implements One, two{

	public static void main(String [] args) throws CloneNotSupportedException {
	    // instantatiation and calling instance methods.
		MultipleInheritanceJava obj = new MultipleInheritanceJava();
		obj.printMessage();
		obj.printSomething();
		
		Object obj1 ;
		// will throw the clone not supported example because cloning is not supported here 
		obj1 = obj.clone();
		System.out.println(obj1.hashCode());
		// System.out.println(obj1.hashCode());
		
 }
	
	public void printMessage() {
		System.out.println("Hello printing message");
	}
	
	public void printSomething() {
		System.out.println("Hello printing something");
	}
}
