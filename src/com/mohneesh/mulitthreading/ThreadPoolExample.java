package com.mohneesh.mulitthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	int id;
	WorkerThread(int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"\t Start \t"+ id);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"\t End \t"+ id);
		
	}

	
	void processMessage() {
		try {Thread.sleep(2000);}catch(InterruptedException ie) {ie.printStackTrace();}
	}
}

public class ThreadPoolExample {
public static void main(String[] args) {
	ExecutorService threadPool = Executors.newFixedThreadPool(5);
	for(int i=0 ;i <10 ; i++) {
		Runnable worker  =  new WorkerThread(i);
		threadPool.execute(worker);
	}
	threadPool.shutdown();
	
//	while(threadPool.isShutdown()) {
//		System.out.println("All task are completed");
//	}
	
}
}
