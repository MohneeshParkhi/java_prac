package com.mohneesh.mulitthreading;

public class ThreadGroupEx2 implements Runnable{
	
	public void run() {
		System.out.println("Current thread name \t "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadGroupEx2 th = new ThreadGroupEx2();
		
		ThreadGroup tg = new ThreadGroup("Parent thread");
		
		Thread t1 = new Thread(tg,th,"One");
		Thread t2 = new Thread(tg,th,"Two");
		Thread t3 = new Thread(tg, th,"Three");
		t1.start();
		
		t2.start();
		t3.start();
		
		System.out.println("Thread Group name "+ tg.getName());
		tg.list();
		
		
	}

}
