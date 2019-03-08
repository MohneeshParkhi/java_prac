/**
 *  Program shows the practical use of static keywords in java.
 */


package com.mohneesh.interfaceExamples;


interface staticInterface{
	
	static void sum() {
	System.out.println("Sum id : " + "45");
	}
	
	void printHClName();
}

interface createInstance{
	
	static StaticKeywordExample createObject() {
		return new StaticKeywordExample();
	}
}

// checking that implementation of interface is necessary or not...

interface checkInterfaceImpl{
	static void checkMeth() {
		System.out.println("checking whether that interface implementation is necessary or not to call a method");
	}
}

public class StaticKeywordExample implements staticInterface{

	public static void main(String[] args) {
		
		staticInterface.sum();
		StaticKeywordExample ob = new StaticKeywordExample();
		ob.printHClName();
		StaticKeywordExample obj;
		obj  = createInstance.createObject();
		obj.printObjectInformation(obj);
		// no need to implement the interface in case of static methods...
		checkInterfaceImpl.checkMeth();
		StaticKeywordExample.sum();
		
	}
    
	
	public static void sum() {
		System.out.println("Sum is not overridden");
	}
	
	@Override
	public void printHClName() {
		// TODO Auto-generated method stub
		System.out.println("HCL is here");
	}
	
	public void printObjectInformation(StaticKeywordExample obj) {
		
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		// System.out.println();
	}
}
