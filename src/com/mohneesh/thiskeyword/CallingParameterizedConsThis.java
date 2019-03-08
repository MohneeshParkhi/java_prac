package com.mohneesh.thiskeyword;

/**
 * Calling constructor from constructor is called constructor chaining
 * @author mohneesh
 *
 */
class UseCase{
	
	UseCase(){	
	this(10);
	}
	
	UseCase(int j){
		int k = j;
		System.out.println("Value of k "+ k);
	}
}


public class CallingParameterizedConsThis {
public static void main(String[] args) {
	UseCase ob = new UseCase();
	
}
}
