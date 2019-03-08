package com.mohneesh.thiskeyword;

/**
 * No use of this as simple calling also invoke same class method.
 * @author mohneesh
 *
 */
class InheritUse{
	void write() {
		System.out.println("In inherit use case method"); 
	}
}

class Usecase extends InheritUse{
	/*
	 * int i=10; int u = 20;
	 */
	void print() {
	System.out.println("In print method");
	
	write();
	// calling using this keyword...
	this.write();
	}

	
	void write() {
		System.out.println("In write method");
	}
}

public class CurrentClassMethInvoke {
public static void main(String[] args) {
	Usecase ob = new Usecase();
	ob.print();
}
}
