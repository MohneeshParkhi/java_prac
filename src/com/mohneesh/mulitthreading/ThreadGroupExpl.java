package com.mohneesh.mulitthreading;

class DemoThread extends Thread{
	public void run() {
		System.out.println("Thread is here");
	} 
}

public class ThreadGroupExpl{public static void main(String[] args) {
	
	ThreadGroupExpl th = new ThreadGroupExpl();
	ThreadGroup thg = new ThreadGroup("Parent thread");
	
	DemoThread dt  = new DemoThread();
	Thread t = new Thread(thg, dt, "one");
	t.start();
	Thread t1 = new Thread(thg, dt, "two");
	t1.start();
	
	System.out.println("Thread goup name \t"+ thg.getName());
	thg.list();
}

}
