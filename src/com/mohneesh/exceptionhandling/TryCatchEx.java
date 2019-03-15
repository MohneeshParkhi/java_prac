package com.mohneesh.exceptionhandling;


/**
 *  Try block will not be executed if exception is thrown, so dont keep the code part that will not throw
 *  the exception
 * @author mohneesh
 *
 */

 class ExampleNothandling{
    int a;
	 protected ExampleNothandling(int b){
	  this.a = b;
  }	
	protected void printValue(){
		//int a = 20;
		System.out.println(a);
		int k = a/0;
		System.out.println(k);
	}
}

 class ExceptionTryHandle {
	 int k;
	 
	 protected  ExceptionTryHandle(int k) {
		 this.k = k;
	 }
	 
	 protected void  printValueExceptionhandle() {
		 
		 try {
			 int l =k/0;
			 System.out.println(l);
		 }catch(ArithmeticException ex) {
			 ex.printStackTrace();
			 System.out.print("In catch block");
		 }
		 System.out.println("Rest of the code");
	 }
 }

public class TryCatchEx {
public static void main(String[] args) {
	ExampleNothandling ob = new ExampleNothandling(10);
	ExceptionTryHandle obj = new ExceptionTryHandle(20);
	try{
		ob.printValue();
	}catch(ArithmeticException ex) {
		ex.printStackTrace();}
	obj.printValueExceptionhandle();
	
}
}
