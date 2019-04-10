package com.mohneesh.mulitthreading.synchronisation;


class Table {
	
	
	
	public  synchronized void printTable(int n){
		System.out.println("Printing table of " + n);
		for(int i=1; i<=10;i++) {
			System.out.println(i*n);
		}
	}
}

class ThreadSynchronizationDemoOne extends Thread{
	
	Table table;
	
	ThreadSynchronizationDemoOne(Table t){
		table =t;
	}
	
	
	@Override
	public void run() {
	 table.printTable(10); 	
	}
}

class ThreadSynchronizationDemoTwo extends Thread{
	Table table;
	
	ThreadSynchronizationDemoTwo(Table t){
		table= t;
	}
	
	@Override
	public void run() {
		table.printTable(5);
	}
}

public class TestSynchronization {
	public static void main(String[] args) {
		Table  table = new Table();
		ThreadSynchronizationDemoOne thread1 = new ThreadSynchronizationDemoOne(table);
		ThreadSynchronizationDemoTwo thread2 = new ThreadSynchronizationDemoTwo(table);
		
		thread1.start();
		thread2.start();
	}	
}
