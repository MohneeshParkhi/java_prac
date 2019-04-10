package com.mohneesh.mulitthreading.synchronisation;

/**
 *  Shared resource is accesses by various thread
 * @author mohneesh
 *
 */
class TableObj {
	
	void printTable(int n) {
		for(int i=0;i<= 5;i++) {
			System.out.println(n*i);
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e) {e.printStackTrace();}
		}
	}
}

class DemothreadOne extends Thread{
	TableObj obj;
	
	DemothreadOne(TableObj o){
		this.obj = o;
	}
	
	@Override
	public void run() {
		obj.printTable(5);
	}
}


class DemoThreadTwo extends Thread{
	TableObj ob;
	
	DemoThreadTwo(TableObj oo){
		this.ob= oo;
	}
	@Override
	public void run() {
		ob.printTable(100);
	}
}


public class ProblemWithoutSynchronization {
	public static void main(String[] args) {
		TableObj tabel = new TableObj();
		DemothreadOne dto = new DemothreadOne(tabel);
		dto.start();
		
		DemoThreadTwo dtt = new DemoThreadTwo(tabel);
		
		dtt.start();
	}
}
