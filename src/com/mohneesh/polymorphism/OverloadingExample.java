package com.mohneesh.polymorphism;
/**
 *  As you can see, Given below class has more than one method with same signature. Concept is called
 *  Overloading
 * @author mohneesh
 *
 */

class Maruti{

	protected float speed;
	protected String model;
	protected String Company;
	
	void init(String company) {
		this.Company = company;
	}

	void init(float speed, String model) {
		// TODO Auto-generated method stub
		
	}
	
	void init(float question) {
		
	}
}





public class OverloadingExample {

}
