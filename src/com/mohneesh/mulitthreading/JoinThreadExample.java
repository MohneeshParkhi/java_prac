package com.mohneesh.mulitthreading;

class TestThread extends Thread{
	
	@Override
	public void run(){
		for(int k=0 ; k < 5;k++) {
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				e.printStackTrace();
			};
			System.out.println(k);
		}
	}
}

public class JoinThreadExample {
public static void main(String[] args) {
	TestThread th = new TestThread();
	TestThread t1 = new TestThread();
	TestThread t2 = new TestThread();
	th.start();
	
	try {
	th.join();	
	} catch (Exception e) {
		e.getLocalizedMessage();
	}
	try{
		t1.start();
	    t1.join();
	} catch(InterruptedException ex) {ex.printStackTrace();};
	t2.start();
	
}
}
