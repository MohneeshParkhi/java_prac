package com.mohneesh.mulitthreading.synchronisation;

import java.util.LinkedList;

class PC {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	
	// function called by producer thread....
	 
	public void produce() throws InterruptedException {
		int value =0;
		while(true) {
			synchronized(this) {
				while(list.size() == capacity) {
					wait();
				}
				System.out.println("Producer produced" + value);
				
				list.add(value++);
				
				// noytify all waiting thread to consume the value
				notify();
				
				// makes working of program easier to understand
				Thread.sleep(2000);
			}
		}
	}
	
	
	// method to code to consume the value....
	
	 public void consume() throws InterruptedException {
		 while(true) {
			 synchronized(this) {
				 while(list.size()==0) {
					 wait();
				 }
				 
				 // retreiving first job from the list....
				 int val = list.removeFirst();
				 
				 System.out.println("Retreived consumed value is :" + val);
				 
				 // notifying al threads...
				 notify();
			    
				 // to understand the code...
				 Thread.sleep(2000);
			 }
		 }
	 }
	
}


public class ProducerConsumerProbSol {
	public static void main(String[] args) throws InterruptedException{
		
		final PC pc = new PC();
		
		// creating producer thread...
			Thread t1 = new Thread(
				new Runnable() {
					public void run() {
						try{pc.produce();} catch(Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			);
			
			
			// creating a Consumer thread..
			
			Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {pc.consume();} catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
	}
}
