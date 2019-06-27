package com.java.oops;

public class StaticPolimorphism {
 
	void demo() {
		System.out.println("hello");
	}
	
	void demo(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
	StaticPolimorphism stp = new StaticPolimorphism();
	StaticPolimorphism st = new StaticPolimorphism();
	
	stp.demo();
	st.demo(10);
}
}
