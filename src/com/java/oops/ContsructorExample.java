package com.java.oops;

import java.util.Date;

class ProtectedConstructor{
	
	protected ProtectedConstructor(String k) {
		System.out.println(k);
	}
	public ProtectedConstructor(Date date ) {
		System.out.println("Hello World " + date.getDate());

	}
	
}




public class ContsructorExample  extends ProtectedConstructor{
 
	
	/**
	 * Default constructor 
	 */
	ContsructorExample(){
		 super("mohneesh");
	}
	
	private  ContsructorExample(int a){
		 super("parkhi");
	 System.out.println(a);
	}
	
	private int ContsructorExample () {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
	
		
		// default constructor 
		ContsructorExample obj = new ContsructorExample();
		
		
		// private parameterized constructor
		ContsructorExample ob = new ContsructorExample(10);
		
		
		ProtectedConstructor protectedOb = new ProtectedConstructor("Mohneesh");
		
		ProtectedConstructor ooo = new ProtectedConstructor(new Date());
		
		System.out.println(obj.hashCode());
		System.out.println(ob.hashCode());
		
}
}
