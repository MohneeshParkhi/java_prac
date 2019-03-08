package com.mohneesh.staticExamples;

class Parent{
	static class Child{
		 int a =10;
	}

   int varA;
}

class ParentCl{
	static interface chi{
		int a = 10;
	}
	
	static class abc implements chi{
		void print() {
			System.out.println(a);
		}
	}
}


public class AccessingNestedClass {
public static void main(String[] args) {
	Parent p = new Parent();
	// Parent.Child.a  = 30;
	// System.out.println(Parent.Child.a);
  Parent.Child c = new Parent.Child();
  c.a = 60;
  p.varA =30;
  System.out.println(c.a+p.varA);
 // inetface and child class
  ParentCl.abc  ab = new ParentCl.abc();
  ab.print();
}
}

