package com.mohneesh.polymorphism;

class RBI{
	float iRate;
	
	void printRate(){
		System.out.println("Rate is :" + iRate);
	}
}

public class Overriding extends RBI{
public static void main(String[] args) {
	
}

@Override
void printRate() {
	System.out.println("ola ola");
}
}
