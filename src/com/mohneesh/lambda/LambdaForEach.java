package com.mohneesh.lambda;

import java.util.ArrayList;

interface Iterate{
 void printArrayList(ArrayList arr);	
}
public class LambdaForEach {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(30);
		a.add(40);
		
		Iterate it = (ArrayList arr) -> {
			arr.forEach(n -> System.out.println(n)); 
				};
	   it.printArrayList(a);	   
		}
}
