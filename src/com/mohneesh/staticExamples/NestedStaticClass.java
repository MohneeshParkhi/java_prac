package com.mohneesh.staticExamples;

// static member variables can be initialized using constructor.
class StaticClass{
	 static int a;
	 static boolean check;
	 // checking that static variable are intialized using constructor
	 StaticClass(int k){
		 a=k;
	 }
	 
	 void StaticClass(boolean ch) {
		 System.out.println(a);
		 check= ch;
		 System.out.println(check);
	 }
}
public class NestedStaticClass {
public static void main(String[] args) {
	StaticClass ob = new StaticClass(10);
	// staticClass.NestedStaticClass 
	ob.StaticClass(true);
	
}
}
