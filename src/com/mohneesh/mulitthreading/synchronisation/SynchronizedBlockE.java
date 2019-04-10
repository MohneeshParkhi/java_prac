package com.mohneesh.mulitthreading.synchronisation;

class bike{
	
	void bikSpeed(int k) {
		synchronized(this){
		System.out.println("bike is running"+ k);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}}
	}
}

class thread1 extends Thread{
	bike b;
	
	thread1(bike bb){
		this.b =bb;
	}
	
	
	public void run() {
		b.bikSpeed(10);
	}
	
}

class thread2 extends Thread{
	bike b;
	
	thread2(bike bb){
		this.b =bb;
	}
	
	
	public void run() {
		b.bikSpeed(20);
	}
	
}

public class SynchronizedBlockE {
	public static void main(String[] args) {
		bike hh = new bike();
		
		thread1 t = new thread1(hh);
		thread2 tt = new thread2(hh);
		t.start();
		tt.start();
	}
}
