package com.java.designPatterns;

/**
 *  This is example of simple singleton pattern 
 * @author mohneesh
 *
 */




// It is example of Eagerly Singleton Object.
class Vehicle {
	public static Vehicle vObj = new Vehicle();
	
	private Vehicle() {}
	
	
	static Vehicle getVehicleObject() {
		return vObj;
	}
	
	
	static void print() {
		System.out.println("Printing Vehicle details Object hashcode :" + vObj.hashCode());
	}
	
}


public class SingltonDesignPattern {
 public static void main(String[] args) {
	
	 Vehicle vehicleObject = Vehicle.getVehicleObject();
	 vehicleObject.print();
	 
}
}
