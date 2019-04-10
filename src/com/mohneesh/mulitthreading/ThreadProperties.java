package com.mohneesh.mulitthreading;

class ThreadClass extends Thread{
	public void run() {
		System.out.println("i m rocking thread");
	}
} 

public class ThreadProperties {
public static void main(String[] args) {
	ThreadClass tc = new ThreadClass();
	tc.start();
	System.out.println(tc.getId());
	System.out.println(tc.getPriority());
	System.out.println(tc.getName());
	tc.setName("Mohneesh Parkhi");
	System.out.println(tc.getName());
    System.out.println(tc.getThreadGroup());
    System.out.println(tc.MAX_PRIORITY);

}
}
