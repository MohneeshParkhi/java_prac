package com.mohneesh.mulitthreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	
	private String name;
	
	/*
	 * Task(String name){ this.name = name; }
	 */
	
	synchronized public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void run() {
		try {
			Long duration = (long)(Math.random() *10);
			System.out.println("Executing "+ name);
			TimeUnit.SECONDS.sleep(duration);
		}catch(Exception ex) {ex.printStackTrace();}
	}
}

public class SingleThreadPoolExmapleTwo {
	public static void main(String[] args) throws InterruptedException {
		
		Task t = new Task();
		
		Executor executor = Executors.newSingleThreadExecutor();
	    
		
		for(int i=0;i<=5 ;i++) {
			String s = "hello"+i;
			
			t.setName(s);
			
			executor.execute(t);
			
		}
		
	}
}
