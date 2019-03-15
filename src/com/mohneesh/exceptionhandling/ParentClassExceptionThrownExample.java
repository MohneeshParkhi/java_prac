package com.mohneesh.exceptionhandling;
/**
 *  if Programmer will not maintain the hierarchy of exception, it will throw compile
 *  errors.
 * @author mohneesh
 *
 */
class ParentClass{
	String s ;
	
	void print() {
		s= null;
		System.out.println(s);
	}
	void printAgain() {
		s= "mohneesh";
		System.out.println(s);
	}
	void inti() {
		s= null;
		
		System.out.println(s.length());
	}
}
public class ParentClassExceptionThrownExample {
public static void main(String[] args) {
	ParentClass obj = new ParentClass();
	obj.print();
	obj.printAgain();
	try{
		obj.inti();
	} catch(ArithmeticException ae) {
		System.out.println(ae);
	}catch(IndexOutOfBoundsException io) {
		System.out.println(io);
	}catch(Exception ex) {
		System.out.println(ex);
	}
}
}
