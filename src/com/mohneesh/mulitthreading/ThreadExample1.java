package com.mohneesh.mulitthreading;

class Car extends Thread{
	
	public void run() {
		this.carProp();
	}
	void carProp() {
		System.out.println("car is running");
	}
}

class Bike implements Runnable{
	void print() {
		System.out.println("Bike is running");
	}

	@Override
	public void run() {
		this.print();
		
	}
}
public class ThreadExample1 extends Thread{
	
	public void  run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		ThreadExample1 th = new 
		ThreadExample1();
		th.start();
		Car c = new Car();
		c.start();
		
		Bike b = new Bike();
		Thread h = new Thread(b);
		h.start();
		
	}
}
