package com.mohneesh.mulitthreading;

class TestThread1 implements Runnable{
    
	@Override
	public void run() {
		System.out.println("Calling the thread one");
	}
}

class TestThread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0 ;i<5 ;i++) {
     		try{Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
			System.out.println("calling thread two"+ i);
			
		}	
	}
}

public class CallinRunDirect {
public static void main(String[] args) {
	TestThread2 t1 = new TestThread2();
	TestThread2 t2 = new TestThread2();
	
	Thread th = new Thread(t1);
	t1.run();
	t2.run();
	// t2.run();
	
}

}
