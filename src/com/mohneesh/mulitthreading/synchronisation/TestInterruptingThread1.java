package com.mohneesh.mulitthreading.synchronisation;


public class TestInterruptingThread1 extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Task is continuosuly going on...");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Interrupted Exception"+ e);
		}
	}
public static void main(String[] args) {
	TestInterruptingThread1 tg = new TestInterruptingThread1();
	tg.start();
	try {
		tg.interrupt();
	}catch(Exception e) {
		
		System.out.println("Exception handled" + e);
	}
	
	
}
}
