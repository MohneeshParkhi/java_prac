package com.mohneesh.inheritance;
class ShoeFactory{
	int size;
	String brand;
	
}


class RedTape extends ShoeFactory{
	void init(int s, String bName){
		this.size = s;
		this.brand = bName;
	}
	
   void printDetails() {
	   System.out.println("Details are as follows");
	   System.out.println(this.size);
	   System.out.println(this.brand);
   }	
}

public class MultiLevIneritance extends RedTape{
public static void main(String[] args) {
	MultiLevIneritance ob = new MultiLevIneritance();
	ob.printDetails();
	ob.init(10,"Red Tape");
	ob.printDetails();
}
}
