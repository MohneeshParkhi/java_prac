package com.mohneesh.AbstractClassExamples;

class RBI{
	void control(){
		System.out.println("calling RBI to control other banks ");
	}
}


class SBI{
	
	RBI rbi;
	
	SBI(RBI sb){
		this.rbi = sb;
	}
	void print() {
		rbi.control();
	}
}

public class AggregationBankExample {
public static void main(String[] args) {
	
	SBI sb = new SBI(new RBI());
	sb.print();
	
}
	
}
