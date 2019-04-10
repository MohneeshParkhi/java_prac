package com.mohneesh.mulitthreading;
class ThreadExample extends Thread{
	
	@Override
	public void run() {
	 if(Thread.currentThread().isDaemon()) {
		 System.out.println("Daemon thread is running");
	 } else {
		 System.out.println("User thread works");
	 }	
	}
	
}
public class DaemonThreadExample {
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		ThreadExample tt = new ThreadExample();
		ThreadExample ttt = new ThreadExample();
		te.setDaemon(true);
		te.start();
		tt.start();
		ttt.start();
	}
}
