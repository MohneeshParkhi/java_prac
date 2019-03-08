package com.mohneesh.interfaceExamples;

interface useCaseOne{
	public default void printString() {
		System.out.println("Hello world, first implementation of default Method");
	}
	public  default void printSomething(){
		System.out.println("bla bla bla bla ");
	}
	
	public abstract void doSomething();
}


/*
 * @author mohneesh parkhi
 */
public class DefaultMethInterface implements useCaseOne{
	public static void main(String[] args) {
		String str = "Overriden method implementions";
	DefaultMethInterface obj = new DefaultMethInterface();
	obj.printString(str);
	obj.printString();
	obj.printSomething();
}
   
	 @Override
	 public void printString() {
		 System.out.println("Overridden methods of parent interface");
	 }
	
	 public void printString(String str) {
		System.out.println(str);
	}
	 @Override
	 public void doSomething() {
		 System.out.println("Doing something bro ! yes ofcourse");
	 }
}
