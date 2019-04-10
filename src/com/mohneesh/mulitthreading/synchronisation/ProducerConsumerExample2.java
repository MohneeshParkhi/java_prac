package com.mohneesh.mulitthreading.synchronisation;

import java.util.LinkedList;
import java.util.List;

class CommonResource{
	
	List<String> list = new LinkedList<>();
	
	// to fix the capacity of list that contain the minimum number of elements.
	int capacity =2;
	
	public synchronized void produce(String value) {
		System.out.println("Consumed Value \t"+ value);
		try {
		if(list.size() != capacity) {
			list.add(value);
		}
		else {
			wait();
		}} catch(Exception ex) {ex.printStackTrace();}
	    
		// notify all waiting threads...
		notify();
	}
	
	public synchronized void consume() {
	 	
		String consumedValue= null;
	    try {
	    	if(list.size()!= 0) {
	    		consumedValue = list.remove(0);
	    	} 	
	    }catch(Exception ex) {ex.printStackTrace();}
	    
	    System.out.println("Retreived cosumed value : \t" + consumedValue);
}
}

public class ProducerConsumerExample2 {
		public static void main(String[] args) throws InterruptedException{
			CommonResource comRes = new CommonResource();
		    
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					comRes.produce("mohneesh");
				}
			});
			
		
			
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				comRes.consume();
			}
		});
		
		
		t.start();
		t1.start();
		
		t.join();
		t1.join();
}
		}

