package com.mohneesh.mulitthreading;

/**
 *  This Shutdown hook is called before JVM destruction either implicitly or 
 *  explicitly to clear all resources
 * @author mohneesh
 *
 */

class DummyThread implements Runnable{
	
	public void run() {
		System.out.println("Shot down hook implemented");
	}
	
}
public class ShutdownHookExample {
	public static void main(String[] args) {
		DummyThread dt = new DummyThread();
		
		Thread t = new Thread(dt);
		t.start();
		
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(t);
		
		System.out.println("Main thread is sleeping, press ctrl +c to exit");
		
		try {
			t.sleep(5000);
			
		}catch(InterruptedException ex) {ex.getLocalizedMessage();}
		
	}

}
