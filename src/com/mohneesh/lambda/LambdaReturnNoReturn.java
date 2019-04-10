package com.mohneesh.lambda;

interface Addable{
	int add(int a, int b);
} 
public class LambdaReturnNoReturn {
	public static void main(String[] args) {
		// different syntax to work around 
		Addable a  = (int k, int b)->(k+b);
		System.out.println(a.add(10,20));
		
		Addable aa = (int k, int l) -> {
			return k+l;
		};
		System.out.println(aa.add(300, 400));
	}
}
