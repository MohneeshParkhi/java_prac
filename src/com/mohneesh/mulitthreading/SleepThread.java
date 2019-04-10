package com.mohneesh.mulitthreading;
class TestSleep implements Runnable{
	
	@Override
	public void run() {
		for(int i=0 ; i<5 ;i++) {
			try{Thread.sleep(1000);}catch(InterruptedException ie) {ie.printStackTrace();};
		  System.out.print(i);
		}
	} 
}
public class SleepThread {
public static void main(String[] args) {
	TestSleep ts = new TestSleep();
	Thread th = new Thread(ts);
	th.start();
}
}
