package com.mohneesh.mulitthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Company implements Runnable{
	String name ;
	
	Company(String name){
		this.name = name; 
	}
	
	private  void printCompanyName() {
		System.out.println("Name is follows :" + name);
	}

	@Override
	public void run() {
		System.out.println("Started Waiting to For thread execution");
		//wait(1000);
		
		
		printCompanyName();
		
	}
	
	
}

class Game implements Runnable{
	
	private String gName;
	
	 Game(String gName) {
		this.gName = gName;
	}
	
	 private void printGame() {
		 System.out.println("Game name is : "+ gName); 
	 }
	
	@Override
	public void run() {
		printGame();
	}
}


public class SingleThreadPool{
	
	/*
	 * @Override public void run() {
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		
		
		Company cName = new Company("HCL");
		Game gName = new Game("Assassins Creed");
		ExecutorService executor = Executors.newSingleThreadExecutor();
		 
		 executor.execute(cName);
		 executor.execute(gName);
	}
}
