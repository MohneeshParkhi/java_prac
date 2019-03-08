package com.mohneesh.interfaceExamples;

import java.util.Scanner;

interface CheckDelete{
	void numberDelete(int numToDelete);
}
public class DeleteNumberFromArray implements CheckDelete{

	public static void main(String[] args) {
	DeleteNumberFromArray dlt = new DeleteNumberFromArray();
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	dlt.numberDelete(num);
	}
	
	@Override
	public void numberDelete(int numToDelete) {
	   int temp[] = {1,2,3,4,4,4,5,6};
	   int i, count, placeToHold;
	   count=0;
	   System.out.println("Ckecking presence of a number and deleting the repeated number");
	   for(i=0;i<temp.length;i++) {
		    if(temp[i] ==numToDelete) {
		    	count++;
		    	placeToHold = i; 
		    }
		    if(count>1){
		    	for( int j =0;j<temp.length;j++) {
		    		
		    	}
		    }
	   }
	}
}
