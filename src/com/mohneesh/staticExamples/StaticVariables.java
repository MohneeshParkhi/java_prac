package com.mohneesh.staticExamples;

/**
 *  Program shows the static variable use.
 * @author mohneesh
 *
 */
class UseCaseStaticVar{
	static int i= 10;
	static int j =20;
	
	void printSum() {
		System.out.println(i+j);
	}
}


/* making instance of another class and calling its member method.*/ 
public class StaticVariables {
 public static void main(String[] args) {
	UseCaseStaticVar objS = new UseCaseStaticVar();
	objS.printSum();
}
}
