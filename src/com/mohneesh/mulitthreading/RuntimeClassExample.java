package com.mohneesh.mulitthreading;

public class RuntimeClassExample {
  public static void main(String[] args) {
	Runtime runtime = Runtime.getRuntime();
	System.out.println("Number of processors \t:"+runtime.availableProcessors());
	System.out.println("Free Space \t:"+runtime.freeMemory());
	System.out.println("Max Memory \t:"+runtime.maxMemory());
	System.out.println("Total memroy \t:"+runtime.totalMemory());
	
	System.out.println();
}
}
