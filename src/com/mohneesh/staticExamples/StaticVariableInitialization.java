package com.mohneesh.staticExamples;

// using static block initilization
class staticVariableInit{
	
	static int i ;
	static double j;
	
	static {
		i=10;
		j=20.0;
	}
	
	static void print() {
		System.out.println(i+ "\n"+j);
	}
	
} 

// using static method 
class StaticMethodInit{
	static int i;
	static void initMeth(int var) {
		i = var;
	}
	static void print() {
		System.out.println("value of i \t"+i);
	}
}

// using constructor
class VarInitConstructor{
	static int ab;
	VarInitConstructor(int var){
		ab=var;
	}
	void print() {
		System.out.println("value of ab\t"+ab);
	}
}




public class StaticVariableInitialization {
	public static void main(String[] args) {
	staticVariableInit obj = new staticVariableInit();
	new VarInitConstructor(10).print();
	staticVariableInit.print();
	StaticMethodInit.initMeth(10);
	StaticMethodInit.print();
}
}
