package com.mohneesh.thiskeyword;

class usecase{
	 
	usecase returnInst() {
		return this;
	}
	
	void methd(){
		System.out.println("returning instance");
	}
}

public class ReturnClassInstance {
public static void main(String[] args) {
	new usecase().methd();
}
}
