package com.mohneesh.mulitthreading.synchronisation;

class  Customer{
	int amount =1000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw");
		
		if(this.amount < amount) {
			System.out.println("Amount is less, deposit require");
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
			this.amount += amount;
			System.out.println("deposit completed");
			notify();
		}
	}
	
	synchronized void deposit(int amount){
		System.out.println("Going to deposit");
		this.amount += amount;
		System.out.println("Amount is deposit");
		notify();
	}
}



public class InterThreadCommunication {
	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread(){
			
			public void run() {
				c.withdraw(5000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
