package com.mohneesh.mulitthreading.synchronisation;

public class InterruptingThreadTest extends Thread{
	
	public void run() {
	 try{
		 Thread.sleep(1000);
		 for(int i=0;i<5;i++) {
			 System.out.println("threadinh environment");
		 }
	 }catch(Exception e){}	
	}
	public static void main(String[] args) {
		InterruptingThreadTest o = new InterruptingThreadTest();
		o.start();
		o.interrupt();
	}
}
